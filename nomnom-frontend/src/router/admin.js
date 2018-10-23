const Admin = () => import("@views/admin/index");
const AdminCategories = () => import("@views/admin/categories/index");

export default {
  path: "/admin",
  name: "Главная",
  component: Admin,
  children: [
    {
      path: "categories",
      name: "Категории",
      component: AdminCategories
    },
    {
      path: "products",
      name: "Продукты"
    },
    {
      path: "**",
      name: "Not Found",
      component: {
        // eslint-disable-next-line
        render: h => <h1>404 Не найдено</h1>
      }
    }
  ]
};
