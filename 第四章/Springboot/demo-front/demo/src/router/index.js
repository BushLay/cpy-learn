import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
 {
   path: '/test',
   name: 'test',
   component: () => import('../components/test.vue'),
   meta: {
    title: '测试'
   }
 },
 {
    path: '/user/getall',
    name: 'getall',
    component: () => import('../components/getall.vue'),
    meta: {
    title: '获取数据'
    }
  },
  {
     path: '/user/save',
     name: 'save',
     component: () => import('../components/save.vue'),
     meta: {
     title: '添加数据'
     }
   },
   {
      path: '/user/search',
      name: 'findById',
      component: () => import('../components/findById.vue'),
      meta: {
      title: '查询数据'
      }
    },
    {
       path: '/usertable',
       name: 'UserTable',
       component: () => import('../components/UserTable.vue'),
       meta: {
       title: '用户表'
       }
     }
   
  ]
})
export default router