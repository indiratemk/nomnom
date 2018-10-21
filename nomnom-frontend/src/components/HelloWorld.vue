<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <button class="button button--purple kek" >Hello</button>
  </div>
</template>

<script>
  export default {
    name: "hello-world",
    data() {
      return {
        msg: "Welcome to Your Vue.js App"
      };
    },

  };
</script>

<style>
  .kek {
    color: var(--accent-gradient);
    border: 1px solid var(--accent);
  }
</style>
