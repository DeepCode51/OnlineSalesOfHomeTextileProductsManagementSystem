const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootfx995/",
            name: "springbootfx995",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootfx995/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "家纺用品网上销售系统"
        } 
    }
}
export default base
