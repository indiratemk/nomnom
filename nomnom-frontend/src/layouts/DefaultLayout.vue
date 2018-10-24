<template>
  <div>
    <app-header/>
    <slot/>
    <app-footer/>
  </div>
</template>

<script>
import AppHeader from '../components/AppHeader';
import AppFooter from '../components/AppFooter';

export default {
  name: 'DefaultLayout',
  components: {
    AppHeader,
    AppFooter
  }
};
</script>

<style scoped>

</style>
