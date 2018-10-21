<template>
  <v-dialog v-model="dialog" max-width="500px">
    <v-btn slot="activator" color="success">
      <v-icon left>add_box</v-icon>
      Добавить категорию
    </v-btn>
    <v-card>
      <v-card-title>
        <span class="headline">{{ formTitle }}</span>
      </v-card-title>

      <v-card-text>
        <v-text-field v-model="editedItem.title" label="Название"/>
      </v-card-text>

      <v-card-actions>
        <v-spacer/>
        <v-btn color="blue darken-1" flat @click.native="close">Cancel</v-btn>
        <v-btn color="blue darken-1" flat @click.native="save">Save</v-btn>
      </v-card-actions>
    </v-card>
  </v-dialog>
</template>

<script>
  export default {
    name: "CategoryForm",
    props: {
      show: Boolean
    },
    data() {
      return {
        isEditing: false,
        editedItem: {
          title: ""
        },
        defaultItem: {
          title: ""
        }
      };
    },
    computed: {
      formTitle() {
        return this.isEditing === -1 ? "Добавить категорию" : "Изменить категорию";
      },
      dialog: {
        get() {
          return this.show;
        },
        set(value) {
          this.$emit("form-action", value);
        }
      }
    },

    watch: {
      dialog(val) {
        // eslint-disable-next-line
        val || this.close();
      }
    },

    methods: {
      close() {
        this.isEditing = false;
        this.editedItem = Object.assign({}, this.defaultItem);

        this.$emit("form-action");
      },

      save() {
        console.log("saved");
        this.close();
      }
    }
  };
</script>

<style scoped>

</style>
