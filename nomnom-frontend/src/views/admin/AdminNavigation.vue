<template>
  <v-navigation-drawer
    v-model="navigation"
    temporary
    absolute
  >
    <v-list class="pa-1">
      <v-list-tile
        avatar
        tag="div">
        <v-list-tile-content>
          <v-list-tile-title>Навигация</v-list-tile-title>
        </v-list-tile-content>
      </v-list-tile>
    </v-list>

    <v-divider/>

    <v-list 
      class="pt-0" 
      dense>
      <router-link
        v-for="item in items"
        :key="item.title"
        :to="item.link"
        tag="v-list-tile"
      >
        <v-list-tile-action>
          <v-icon>{{ item.icon }}</v-icon>
        </v-list-tile-action>

        <v-list-tile-content>
          <v-list-tile-title>{{ item.title }}</v-list-tile-title>
        </v-list-tile-content>
      </router-link>
    </v-list>
  </v-navigation-drawer>
</template>

<script>
export default {
  name: 'AdminNavigation',
  props: {
    show: {
      type: Boolean,
      default: false
    }
  },
  data() {
    return {
      items: [
        {
          title: 'Главная',
          icon: 'dashboard',
          link: '/admin'
        },
        {
          title: 'Категории',
          icon: 'list',
          link: '/admin/categories'
        },
        {
          title: 'Продукты',
          icon: 'cake',
          link: '/admin/products'
        }
      ]
    };
  },
  computed: {
    navigation: {
      get() {
        return this.show;
      },
      set(state) {
        return this.$emit('navigation-toggle', state);
      }
    }
  }
};
</script>

<style scoped>

</style>
