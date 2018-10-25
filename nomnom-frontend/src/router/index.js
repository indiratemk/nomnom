import Vue from 'vue';
import Router from 'vue-router';
import MainPage from '../views/MainPage';
import ProductsPage from '../views/ProductsPage';

import admin from './admin';

Vue.use(Router);

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'WebSite',
      component: MainPage
    },
    {
      path: '/products-page',
      name: 'ProductsPage',
      component: ProductsPage
    },
    admin
  ]
});
