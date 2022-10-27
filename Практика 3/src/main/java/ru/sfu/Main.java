package ru.sfu;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class Main {
    public static final int ADD = 1;
    public static final int SHOW = 2;
    public static final int EDIT = 3;
    public static final int DELETE = 4;
    public static final int SEARCH = 5;
    public static final int EXIT = 6;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SpringConfig.class);

        WashingDao washingDAO = context.getBean("washingDao", WashingDao.class);

        int id = washingDAO.findAll().size();

        exit:
        while (true) {

            int choice = Inputs.inputInt("\n1-add\n2-show\n3-edit\n4-delete\n5-search\n6-exit\n");
            Washing washing;
            List<Washing> washingList;
            switch (choice) {

                case ADD:
                    washing = new Washing(
                            id,
                            Inputs.inputInt("Weight"),
                            Inputs.inputInt("clothingCapacity"),
                            Inputs.inputStr("manufacturingCompany"),
                            Inputs.inputStr("model"),
                            Inputs.inputStr("producingCountry")
                    );

                    washingDAO.insert(washing);
                    id++;
                    break;

                case SHOW:
                    washingList = washingDAO.findAll();
                    for (Washing value : washingList) {
                        System.out.println(value);
                    }
                    break;

                case EDIT:
                    int editId = Inputs.inputInt("ID записи для редактирования");
                    washing = new Washing(
                            editId,
                            Inputs.inputInt("Weight"),
                            Inputs.inputInt("clothingCapacity"),
                            Inputs.inputStr("manufacturingCompany"),
                            Inputs.inputStr("model"),
                            Inputs.inputStr("producingCountry")
                    );

                    washingDAO.edit(editId, washing);
                    break;

                case DELETE:
                    int deleteId = Inputs.inputInt("ID записи для удаления");
                    washingDAO.delete(deleteId);
                    break;

                case SEARCH:
                    int maxWeight = Inputs.inputInt("максимальный вес стиральной машинки");

                    washingList = washingDAO.search(maxWeight);
                    for (Washing value : washingList) {
                        System.out.println("Поиск по признаку weight:" + value);
                    }
                    break;

                case EXIT:
                    break exit;
            }
        }

        context.close();
    }
}