package com.aavdeev.capitalandproglang;

import android.support.annotation.NonNull;

public class ProgLang {
    @NonNull
    private final String name;
    @NonNull
    private final String description;
    private final int id;

    public static final ProgLang[] LANGUAGES = {
            new ProgLang("Java", "Java — сильно типизированный объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems", R.drawable.java_lang),
            new ProgLang("PHP", "В 1995 году датский программист (ныне живущий в Канаде) Расмус Лердорф (Rasmus Lerdorf) создал набор скриптов на Perl/CGI для вывода и учёта посетителей его онлайн-резюме, обрабатывающий шаблоны HTML-документов.", R.drawable.php),
            new ProgLang("C#", "объектно-ориентированный язык программирования. Разработан в 1998—2001 годах группой инженеров компании Microsoft под руководством Андерса Хейлсберга и Скотта Вильтаумота как язык разработки приложений для платформы Microsoft .NET Framework.", R.drawable.c),
    };

    public ProgLang(@NonNull String name, @NonNull String description, int id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }


    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
