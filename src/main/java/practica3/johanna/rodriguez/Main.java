package practica3.johanna.rodriguez;

import freemarker.template.Configuration;
import practica3.johanna.rodriguez.servicios.BootStrapService;
import spark.template.freemarker.FreeMarkerEngine;


import static spark.Spark.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BootStrapService.startDb();

        BootStrapService.crearTablas();

        staticFiles.location("/templates");

        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setClassForTemplateLoading(Main.class, "/templates");
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(configuration);


    }
}
