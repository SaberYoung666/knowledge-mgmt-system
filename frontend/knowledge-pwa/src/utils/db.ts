import PouchDB from 'pouchdb'
import idbAdapter from 'pouchdb-adapter-idb'

// 注册 IndexedDB 适配器
PouchDB.plugin(idbAdapter)

// 初始化数据库
export const notesDB = new PouchDB('knowledge_notes', {
  adapter: 'idb',
  auto_compaction: true // 启用自动压缩
})

// 类型定义
export interface Note {
  _id?: string
  _rev?: string
  title: string
  content: string
  createdAt: Date
  updatedAt: Date
}

// 数据库操作方法
export const dbService = {
  async saveNote(note: Omit<Note, '_id' | '_rev' | 'createdAt' | 'updatedAt'>) {
    const doc = {
      ...note,
      _id: `note_${Date.now()}`,
      createdAt: new Date(),
      updatedAt: new Date()
    }
    return await notesDB.put(doc)
  },

  async getNotes() {
    const result = await notesDB.allDocs<Note>({
      include_docs: true,
      descending: true
    })
    return result.rows.map(row => row.doc!)
  },

  async deleteNote(id: string) {
    const doc = await notesDB.get(id)
    return await notesDB.remove(doc)
  }
}