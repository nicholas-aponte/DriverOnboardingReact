import BasicDriverInfoForm from "../components/BasicDriverInfoForm";
import DriverLocationDocs from "../components/DriverLocationDocsForm";
const routes = [
    {
      path: "/basic-driver-info",
      name: "Basic Info",
      component: BasicDriverInfoForm,
    //   layout: "/app",
    },
    {
      path: "/location-documents",
      name: "documents",
      component: DriverLocationDocs,
    //   layout: "/app",
    },
    
];

export default routes;
