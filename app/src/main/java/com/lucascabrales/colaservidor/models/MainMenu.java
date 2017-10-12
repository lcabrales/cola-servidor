package com.lucascabrales.colaservidor.models;

import java.util.ArrayList;

/**
 * Created by lucascabrales on 9/26/17.
 */

public class MainMenu {
    public Integer id;
    public String title;
    public String image;
    public String controller;

    public static ArrayList<MainMenu> getList() {
        ArrayList<MainMenu> list = new ArrayList<>();
        list.add(0, new MainMenu("fa-gears", "Parámetros de la Simulación", "ParamsActivity"));
        list.add(1, new MainMenu("fa-line-chart", "Distribuciones", "DistributionsActivity"));
        list.add(2, new MainMenu("fa-info-circle", "Acerca de Nosotros", "AboutUsActivity"));

        return list;
    }

    private MainMenu(String image, String title, String controller) {
        this.image = image;
        this.title = title;
        this.controller = controller;
    }
}