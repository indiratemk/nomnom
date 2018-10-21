<template>
  <div>
    <v-alert
      :value="error"
      type="error"
      :dismissible="true"
    >
      {{ error }}
    </v-alert>
    <v-btn color="success" :left="true">Добавить новую категорию</v-btn>
    <v-divider/>
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
  export default {
    name: "AdminCategories",
    data() {
      return {
        categories: null,
        error: null
      };
    },
    created() {
      this.$axios.get("http://localhost:8085/api/categories")
        .then(({data}) => this.categories = data)
        .catch(error => {
          console.error(error);
          this.error = error.message;
        });
    }
  };
</script>
<style scoped>

</style>
