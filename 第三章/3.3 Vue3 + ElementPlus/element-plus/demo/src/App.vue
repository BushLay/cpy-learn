<script setup>
import HelloWorld from './components/HelloWorld.vue'
import { ElMessage, ElMessageBox, ElNotification } from 'element-plus'
import { ref } from 'vue'
import axios from 'axios'


//axios
async function getList() {
  const res = await axios({
    url: 'https://q6zv39.laf.run/get_list',
    method:'GET'
  })
  console.log(res);
    
}

//消息
const openMsg = () => {
  ElMessage({
    message: '这是一条消息提示',
    type: 'success',
    showClose: true,
  })
}

const open = () => {
  ElMessageBox.confirm(
    '你确定要永久删除这个文件吗？',
    '警告2',
    {
      confirmButtonText: '确定',
      cancelButtonText: '取消',
      type: 'warning',
    }
  )
    .then(() => {
      ElMessage({
        type: 'success',
        message: '删除成功',
      })
    })
    .catch(() => {
      ElMessage({
        type: 'info',
        message: '取消删除',
      })
    })
}

const openNotification = () => {
  ElNotification({
    title: '成功',
    message: '这是一条成功消息',
    type: 'success',
    position: 'bottom-right',
  })
}
</script>

<template>
  <!-- <div>
    <a href="https://vitejs.dev" target="_blank">
      <img src="/vite.svg" class="logo" alt="Vite logo" />
    </a>
    <a href="https://vuejs.org/" target="_blank">
      <img src="./assets/vue.svg" class="logo vue" alt="Vue logo" />
    </a>
  </div>
  <HelloWorld msg="Vite + Vue" /> -->

  <!-- 按钮 -->
  <el-button>Default</el-button>
    <el-button type="primary" @click="openMsg">消息</el-button>
    <el-button type="success" @click="open">消息确认框</el-button>
    <el-button type="info" @click="openNotification">通知</el-button>
    <el-button type="warning">Warning</el-button>
    <el-button type="danger" @click="getList">axios</el-button>


  <!-- 菜单 -->
  <!-- <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
    <el-menu-item index="1">Processing Center</el-menu-item>
    <el-menu-item index="1">Processing Center</el-menu-item>
    <el-menu-item index="1">Processing Center</el-menu-item>
    <el-sub-menu index="2">
      <template #title>Workspace</template>
      <el-menu-item index="2-1">item one</el-menu-item>
      <el-menu-item index="2-2">item two</el-menu-item>
      <el-menu-item index="2-3">item three</el-menu-item>
      <el-sub-menu index="2-4">
        <template #title>item four</template>
        <el-menu-item index="2-4-1">item one</el-menu-item>
        <el-menu-item index="2-4-2">item two</el-menu-item>
        <el-menu-item index="2-4-3">item three</el-menu-item>
      </el-sub-menu>
    </el-sub-menu>
    <el-menu-item index="3" disabled>Info</el-menu-item>
    <el-menu-item index="4">Orders</el-menu-item>
  </el-menu> -->
</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
  transition: filter 300ms;
}

.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}

.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
