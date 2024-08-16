import { createApp } from 'vue'
import './style.css'
//整体导入ElementPlus组件库
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import App from './App.vue'

// createApp(App).mount('#app')
const app = createApp(App)
app.use(ElementPlus)
app.mount('#app')
