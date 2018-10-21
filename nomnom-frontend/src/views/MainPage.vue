<template>
  <div class="container">
  <app-header></app-header>
  <app-menu></app-menu>
  </div>
</template>

<script>
  import AppHeader from "../components/AppHeader";
  import AppMenu from "../components/AppMenu";

  export default {
    name: "main-page",
    components: {
        AppHeader,
        AppMenu
    }

  };
</script>

<style>
  .container{
    background-color: var(--primary-light-gray);
  }
</style>

