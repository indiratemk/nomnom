<template>
  <div>
    <v-toolbar>
      <v-toolbar-side-icon @click="toggleNavigation"/>
      <v-toolbar-title>{{ title }}</v-toolbar-title>
      <v-spacer/>
      <v-toolbar-items class="hidden-sm-and-down">
        <router-link
          to="/"
          tag="v-btn">
          Главная страница
        </router-link>
      </v-toolbar-items>
    </v-toolbar>
    <admin-navigation
      :show="navigation"
      @navigation-toggle="navigationToggled"
    />
  </div>
</template>

<script>
import AdminNavigation from '@views/admin/AdminNavigation';


export default {
  name: 'AdminHeader',
  components: {
    AdminNavigation
  },
  data() {
    return {
      navigation: false
    };
  },
  computed: {
    title() {
      return this.$route.name;
    }
  },
  methods: {
    toggleNavigation() {
      this.navigation = !this.navigation;
    },
    navigationToggled(state) {
      this.navigation = state;
    }
  }
};
</script>

<style scoped>

</style>
