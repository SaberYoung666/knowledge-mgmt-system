import { createApp } from 'vue'
import App from './App.vue'
import { registerSW } from 'virtual:pwa-register'
import VueEasymde from 'vue3-easymde'
import 'easymde/dist/easymde.min.css'

const app = createApp(App)

// PWA 更新检测
const updateSW = registerSW({
  onNeedRefresh() {
    if (confirm('发现新版本，是否立即更新？')) {
      updateSW()
    }
  }
})

app.use(VueEasymde)
app.mount('#app')