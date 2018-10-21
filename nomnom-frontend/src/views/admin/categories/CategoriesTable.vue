<template>
  <div>
    <v-toolbar dense flat>
      <v-spacer/>
      <category-form
        :show="isFormVisible"
        @form-action="isFormVisible = $event"
      />
    </v-toolbar>
    <v-data-table
      :headers="headers"
      :items="categories"
      hide-actions
      class="elevation-1"
    >
      <template slot="items" slot-scope="{item}">
        <td>{{ item.id }}</td>
        <td>{{ item.title }}</td>
        <td class="justify-center layout px-0">
          <v-icon small class="mr-2" @click="edit">edit</v-icon>
          <v-icon small @click="deleteItem">delete</v-icon>
        </td>
      </template>
    </v-data-table>
  </div>
</template>

<script>
  import CategoryForm from "./CategoryForm";


  export default {
    name: "CategoriesTable",
    components: {
        CategoryForm
    },
    data: () => ({
      isFormVisible: false,
      error: null,
      headers: [
        {
          text: "id",
          sortable: false,
          align: "center",
          value: "id"
        },
        {
          text: "Название",
          value: "title",
          align: "center"
        },
        {
          text: "Действие",
          align: "center",
          value: false
        }
      ],
      categories: []
    }),


    created() {
      this.initialize();
    },

    methods: {
      initialize() {
        this.$api.get("categories")
          .then(({data}) => this.categories = data)
          .catch(error => {
            console.error(error);
            this.error = error.message;
          });
      },

      edit() {
        this.isFormVisible = true;
      },

      deleteItem() {}
    }

  };
</script>

<style scoped>

</style>
