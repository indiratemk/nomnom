import Vue from 'vue';
import api from '@/services/api';
import App from './App';
import router from './router';
import './stylesheets';


Vue.config.productionTip = false;
Vue.prototype.$api = api;


/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
});
