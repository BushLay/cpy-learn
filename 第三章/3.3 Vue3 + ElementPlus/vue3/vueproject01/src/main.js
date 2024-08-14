import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
//引入路由
import { createRouter, createWebHashHistory } from 'vue-router'

//路由配置
let routes = [
    { path: '/', component: () => import('./views/Login.vue') },
    { path: '/test', component: () => import('./views/Test.vue') },
    { path: '/home', component: () => import('./views/HomeView.vue') },
    { path: '/main', component: () => import('./views/Main1.vue'),children:[
        { path: '/main/page1', component: () => import('./views/Page1.vue') },
        { path: '/main/page2', component: () => import('./views/Page2.vue') },
    ] },
    
]

const router = createRouter({
    history: createWebHashHistory(),
    routes,
})  
const app = createApp(App)

app.use(createPinia())
app.use(router)
app.mount('#app')
