<template>
  <div>
    <v-expansion-panel>
      <v-expansion-panel-content
        v-for="category in categories"
        :key="category.key"
      >
        <div slot="header">{{ category.title }}</div>
        <v-card>
          <v-card-text>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
            tempor incididunt ut
            labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation
            ullamco laboris nisi ut
            aliquip ex ea commodo consequat.
          </v-card-text>
        </v-card>
      </v-expansion-panel-content>
    </v-expansion-panel>
  </div>
</template>

<script>
  import axios from "axios";


  export default {
    name: "AdminCategories",
    data() {
      return {
        categories: null
      };
    },
    created() {
      axios.get("http://localhost:8085/api/categories")
        .then(({data}) => this.categories = data)
        .catch(console.error);
    }
  };
</script>
<style scoped>

</style>
