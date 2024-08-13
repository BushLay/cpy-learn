var captcha = '';
window.onload = function(){
    changeCaptcha();
}
function check1(){
    var account = document.querySelector('#name');
    var psd = document.querySelector('#psd');
    
    if(account.value != 'admin' || psd.value != '123456'){
        alert('账号或密码错误');
        account.value = '';
        psd.value = '';
        return false;
    }else{
        // alert('登录成功');
        window.open("https://dict.youdao.com/");
        account.value = '';
        psd.value = '';
        return true;
    }
}
function check2(){
    var phone = document.querySelector('#phone');
    var smscode = document.querySelector('#smscode');

    if(phone.value != '12345678901' || smscode.value != captcha){
        alert('手机号或验证码错误');
        phone.value = '';
        smscode.value = '';
        return false;
    }else{
        // alert('登录成功');
        window.open("https://dict.youdao.com/");
        phone.value = '';
        smscode.value = '';
        return true;
    }
}

function psdLogin(){
    var psdLogin = document.querySelector('#psdLogin');
    var smsLogin = document.querySelector('#smsLogin');
    var content2 = document.querySelector('.content2');
    var content1 = document.querySelector('.content1');
    psdLogin.classList.add('bigblue');
    smsLogin.classList.remove('bigblue');
    content2.style.display = 'none';
    content1.style.display = 'block';
}
function smsLogin(){
    var psdLogin = document.querySelector('#psdLogin');
    var smsLogin = document.querySelector('#smsLogin');
    var content2 = document.querySelector('.content2');
    var content1 = document.querySelector('.content1');
    smsLogin.classList.add('bigblue');
    psdLogin.classList.remove('bigblue');
    content1.style.display = 'none';
    content2.style.display = 'block';

}
function changeCaptcha(){
    var cpc = document.querySelector('#cpc');
    var arr = ['0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];
    captcha = '';
    for(var i = 0; i < 4; i++){
        //生成1~36的随机整数
        var index = Math.floor(Math.random(0, 36)*36);
        captcha += arr[index];
    }
    cpc.innerHTML = captcha;
}
function forget(){
    window.open("https://support.microsoft.com/zh-cn/windows/%E6%9B%B4%E6%94%B9%E6%88%96%E9%87%8D%E7%BD%AE%E5%AF%86%E7%A0%81-8271d17c-9f9e-443f-835a-8318c8f68b9c")
}