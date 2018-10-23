import Vue from "vue";
import Router from "vue-router";
import MainPage from "../views/MainPage";
import TestPage from "../views/TestPage";

import admin from "./admin";

Vue.use(Router);

export default new Router({
  mode: "history",
  routes: [
    {
      path: "/",
      name: "MainPage",
      component: MainPage
    },
    {
      path: "/test",
      name: "TestPage",
      component: TestPage
    },
    admin
  ]
});
