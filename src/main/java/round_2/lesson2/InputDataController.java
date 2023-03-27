package round_2.lesson2;

public class InputDataController {
    public static void displayInputParameters(String... args) {
        switch (args[0]) {
            case "WEEK_DAYS" -> {
                for (int i = 0; i < args.length - 1; i++) {
                    System.out.println(WeekDayModel.WEEK_DAYS.get(Integer.parseInt(args[i + 1]) - 1));
                }
            }
            case "MARKS" -> {
                for (int i = 0; i < args.length - 1; i++) {
                    System.out.println(MarkModel.MARKS.get(Integer.parseInt(args[i + 1])));
                }
            }
            case "PLANETS" -> {
                for (int i = 1; i < args.length; i++) {
                    System.out.println(PlanetModel.PLANETS.get(Integer.parseInt(args[i]) - 1));
                }
            }
            default -> throw new IllegalArgumentException("Wrong input argument passed!");
        }
    }
}
