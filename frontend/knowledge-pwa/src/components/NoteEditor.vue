<script setup lang="ts">
import { ref } from 'vue'
import { dbService } from '../utils/db'

const newNote = ref({
  title: '',
  content: ''
})

const handleSave = async () => {
  try {
    await dbService.saveNote(newNote.value)
    newNote.value = { title: '', content: '' }
    alert('保存成功!')
  } catch (error) {
    console.error('保存失败:', error)
    alert('保存失败，请检查控制台')
  }
}
</script>

<template>
  <div class="editor-container">
    <input 
      v-model="newNote.title" 
      placeholder="笔记标题"
      class="title-input"
    />
    <textarea
      v-model="newNote.content"
      placeholder="开始记录..."
      class="content-textarea"
    ></textarea>
    <button @click="handleSave" class="save-button">
      保存笔记
    </button>
  </div>
</template>

<style scoped>
.editor-container {
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
}

.title-input {
  width: 100%;
  padding: 10px;
  margin-bottom: 10px;
  font-size: 1.2em;
}

.content-textarea {
  width: 100%;
  height: 300px;
  padding: 15px;
  margin-bottom: 15px;
}

.save-button {
  background: #42b983;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
</style>