<template>
  <v-app>
    <admin-header/>
    <v-content>
      <router-view></router-view>
    </v-content>
  </v-app>
</template>

<script>
  import "material-design-icons-iconfont/dist/material-design-icons.css";
  import "vuetify/dist/vuetify.min.css";

  import Vue from "vue";
  import Vuetify from "vuetify";

  import AdminHeader from "@views/Admin/AdminHeader";


  Vue.use(Vuetify);

  export default {
    name: "Admin",
    components: {
      AdminHeader
    }
  };
</script>

<style scoped>

</style>
