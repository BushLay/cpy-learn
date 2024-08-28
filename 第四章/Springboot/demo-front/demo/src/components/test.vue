<template>
    <div>
        <button type="button" @click="doRequest()">请求接口</button>
        <p>结果：{{ requestResult }}</p>
    </div>
</template>

<script setup>
import { getCurrentInstance, reactive, ref } from 'vue'
const { proxy } = getCurrentInstance()

let requestResult = ref('')
const doRequest = async () => {
    let result = await proxy.axios.get('test')
    requestResult.value = result
}
</script>