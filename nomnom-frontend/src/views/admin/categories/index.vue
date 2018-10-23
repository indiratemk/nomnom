<template>
  <v-container>
      <v-alert
        :value="error"
        type="error"
        :dismissible="true"
      >{{ error }}</v-alert>
      <v-divider/>
     <categories-table/>
  </v-container>
</template>

<script>
  import CategoriesTable from "./CategoriesTable";


  export default {
    name: "AdminCategories",
    components: {
      CategoriesTable
    },
    data() {
      return {
        error: null
      };
    }
  };
</script>
<style scoped>

</style>
