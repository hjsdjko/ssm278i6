const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm278i6/",
            name: "ssm278i6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm278i6/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的体育课评分系统"
        } 
    }
}
export default base
