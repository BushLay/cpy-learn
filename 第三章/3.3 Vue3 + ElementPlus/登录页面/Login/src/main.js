import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import { createRouter, createWebHashHistory } from 'vue-router'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
// createApp(App).mount('#app')

let routes = [
    { path: '/', component: () => import('./views/Login.vue') }
]

const router = createRouter({
    history: createWebHashHistory(),
    routes
})
const app = createApp(App)
app.use(router)
app.use(ElementPlus)
app.mount('#app')