<template>
  <div>
    <app-header/>
    <div class="main-content">
      <app-menu/>
      <slot/>
      <app-footer/>
    </div>
  </div>
</template>

<script>
import AppHeader from '../components/AppHeader';
import AppFooter from '../components/AppFooter';
import AppMenu from '../components/AppMenu';

export default {
  name: 'DefaultLayout',
  components: {
    AppHeader,
    AppFooter,
    AppMenu
  }
};
</script>

<style scoped>
  .main-content {
    width: 1000px;
    margin: 0 auto;
  }
</style>
