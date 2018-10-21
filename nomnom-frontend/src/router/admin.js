const Admin = () => import("@views/Admin/index");
const AdminCategories = () => import("@views/Admin/AdminCategories");

export default {
  path: "/admin",
  name: "Главная",
  component: Admin,
  children: [
    {
      path: "categories",
      name: "Категории",
      component: AdminCategories
    }
  ]
};
