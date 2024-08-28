import axios from 'axios'

const instance = axios.create({
    baseURL: 'http://localhost:8080/',
    timeout: 5000 // 请求超时时间
})
// 添加响应拦截器
instance.interceptors.response.use(function (response) {
 return response.data
  }, function (error) {
    // 超出 2xx 范围的状态码都会触发该函数。
    // 对响应错误做点什么
    return Promise.reject(error);
  });

export default instance