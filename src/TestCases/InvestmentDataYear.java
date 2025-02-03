package TestCases;

import java.util.Arrays;
import java.util.List;

public class InvestmentDataYear {
    public static List<Double> getDailyReturns() {
        return Arrays.asList(
                1.2, 2.3, -0.5, 1.8, -1.1, 0.7, 3.2, -0.9, 2.5, -1.5,
                4.1, -0.2, 1.9, 2.8, -1.3, 1.0, 3.5, -0.7, 2.1, -1.7,
                5.0, -0.4, 1.6, 2.6, -1.2, 0.9, 3.3, -0.6, 2.0, -1.9,
                4.8, -0.1, 1.7, 2.7, -1.4, 0.8, 3.4, -0.5, 2.2, -1.6,
                5.1, -0.3, 1.5, 2.9, -1.0, 1.1, 3.6, -0.8, 2.4, -1.8,

                1.5, 2.6, -0.2, 1.9, -1.3, 0.9, 3.4, -0.7, 2.1, -1.7,
                5.2, -0.5, 1.8, 2.7, -1.1, 1.2, 3.7, -0.9, 2.3, -1.5,
                4.9, -0.3, 1.5, 2.5, -1.4, 1.0, 3.5, -0.6, 2.0, -1.8,
                5.3, -0.2, 1.6, 2.8, -1.2, 1.1, 3.8, -0.8, 2.2, -1.6,
                1.7, 2.9, -0.3, 2.1, -1.5, 1.3, 3.9, -0.5, 2.3, -1.9,

                5.5, -0.1, 1.9, 3.0, -1.0, 1.4, 4.0, -0.7, 2.5, -1.6,
                5.2, -0.4, 1.7, 2.7, -1.2, 1.1, 3.7, -0.6, 2.1, -1.8,
                1.9, 3.1, -0.4, 2.3, -1.7, 1.5, 4.1, -0.3, 2.7, -2.0,
                5.7, -0.2, 2.0, 3.2, -1.1, 1.6, 4.3, -0.6, 2.9, -1.9,
                5.4, -0.5, 1.8, 3.0, -1.3, 1.2, 3.9, -0.8, 2.5, -1.7,

                1.2, 2.3, -0.5, 1.8, -1.1, 0.7, 3.2, -0.9, 2.5, -1.5,
                4.1, -0.2, 1.9, 2.8, -1.3, 1.0, 3.5, -0.7, 2.1, -1.7,
                5.0, -0.4, 1.6, 2.6, -1.2, 0.9, 3.3, -0.6, 2.0, -1.9,
                4.8, -0.1, 1.7, 2.7, -1.4, 0.8, 3.4, -0.5, 2.2, -1.6,
                5.1, -0.3, 1.5, 2.9, -1.0, 1.1, 3.6, -0.8, 2.4, -1.8,

                1.5, 2.6, -0.2, 1.9, -1.3, 0.9, 3.4, -0.7, 2.1, -1.7,
                5.2, -0.5, 1.8, 2.7, -1.1, 1.2, 3.7, -0.9, 2.3, -1.5,
                4.9, -0.3, 1.5, 2.5, -1.4, 1.0, 3.5, -0.6, 2.0, -1.8,
                5.3, -0.2, 1.6, 2.8, -1.2, 1.1, 3.8, -0.8, 2.2, -1.6,
                1.7, 2.9, -0.3, 2.1, -1.5, 1.3, 3.9, -0.5, 2.3, -1.9,

                5.5, -0.1, 1.9, 3.0, -1.0, 1.4, 4.0, -0.7, 2.5, -1.6,
                5.2, -0.4, 1.7, 2.7, -1.2, 1.1, 3.7, -0.6, 2.1, -1.8,
                1.9, 3.1, -0.4, 2.3, -1.7, 1.5, 4.1, -0.3, 2.7, -2.0,
                5.7, -0.2, 2.0, 3.2, -1.1, 1.6, 4.3, -0.6, 2.9, -1.9,
                5.4, -0.5, 1.8, 3.0, -1.3, 1.2, 3.9, -0.8, 2.5, -1.7,

                2.1, -1.4, 0.9, 3.6, -0.7, 2.3, -1.5, 4.2, -0.3, 1.8,
                2.9, -1.2, 1.1, 3.7, -0.9, 2.5, -1.7, 4.5, -0.5, 1.6,
                2.7, -1.0, 1.3, 3.9, -0.6, 2.2, -1.3, 4.0, -0.2, 1.9,
                3.1, -1.1, 1.4, 3.8, -0.8, 2.6, -1.6, 4.3, -0.4, 1.7,
                2.5, -1.5, 1.0, 3.5, -0.5, 2.0, -1.4, 4.1, -0.1, 1.8,

                3.3, -0.9, 2.7, -1.7, 4.6, -0.6, 1.9, 3.0, -1.1, 1.2,
                3.8, -1.3, 2.1, -1.5, 4.9
        );
    }
    public static List<List<Integer>> getQueries() {
        return Arrays.<List<Integer>>asList(
                Arrays.asList(15, 27), Arrays.asList(3, 188), Arrays.asList(210, 255), Arrays.asList(75, 92),
                Arrays.asList(300, 325), Arrays.asList(12, 350), Arrays.asList(55, 70), Arrays.asList(180, 215),
                Arrays.asList(90, 110), Arrays.asList(240, 270), Arrays.asList(5, 45), Arrays.asList(150, 175),
                Arrays.asList(60, 85), Arrays.asList(275, 305), Arrays.asList(20, 65), Arrays.asList(115, 140),
                Arrays.asList(80, 105), Arrays.asList(310, 340), Arrays.asList(35, 95), Arrays.asList(160, 190),
                Arrays.asList(100, 130), Arrays.asList(220, 250), Arrays.asList(40, 75), Arrays.asList(185, 210),
                Arrays.asList(125, 155), Arrays.asList(255, 285), Arrays.asList(10, 50), Arrays.asList(195, 225),
                Arrays.asList(70, 90), Arrays.asList(290, 320), Arrays.asList(25, 80), Arrays.asList(135, 165),
                Arrays.asList(95, 120), Arrays.asList(325, 355), Arrays.asList(50, 100), Arrays.asList(200, 230),
                Arrays.asList(110, 145), Arrays.asList(260, 290), Arrays.asList(1, 30), Arrays.asList(170, 205),
                Arrays.asList(65, 80), Arrays.asList(235, 265), Arrays.asList(30, 70), Arrays.asList(145, 170),
                Arrays.asList(85, 115), Arrays.asList(330, 360), Arrays.asList(45, 90), Arrays.asList(215, 245),
                Arrays.asList(130, 160), Arrays.asList(280, 310), Arrays.asList(15, 55), Arrays.asList(175, 210),
                Arrays.asList(75, 100), Arrays.asList(245, 275), Arrays.asList(55, 110), Arrays.asList(190, 220),
                Arrays.asList(105, 135), Arrays.asList(340, 364), Arrays.asList(20, 60), Arrays.asList(205, 235),
                Arrays.asList(80, 120), Arrays.asList(270, 300), Arrays.asList(35, 85), Arrays.asList(155, 185),
                Arrays.asList(115, 150), Arrays.asList(305, 335), Arrays.asList(5, 40), Arrays.asList(225, 255),
                Arrays.asList(90, 130), Arrays.asList(250, 280), Arrays.asList(40, 95), Arrays.asList(165, 195),
                Arrays.asList(120, 155), Arrays.asList(350, 364), Arrays.asList(60, 105), Arrays.asList(230, 260),
                Arrays.asList(100, 140), Arrays.asList(295, 325), Arrays.asList(10, 75), Arrays.asList(180, 215),
                Arrays.asList(70, 110), Arrays.asList(265, 295), Arrays.asList(25, 80), Arrays.asList(140, 175),
                Arrays.asList(95, 135), Arrays.asList(335, 360), Arrays.asList(50, 100), Arrays.asList(200, 235),
                Arrays.asList(125, 160), Arrays.asList(315, 345), Arrays.asList(15, 90), Arrays.asList(195, 220),
                Arrays.asList(85, 125), Arrays.asList(285, 315), Arrays.asList(45, 105), Arrays.asList(170, 200),
                Arrays.asList(130, 165), Arrays.asList(345, 364), Arrays.asList(65, 115), Arrays.asList(240, 270),
                Arrays.asList(110, 150), Arrays.asList(300, 330), Arrays.asList(20, 80), Arrays.asList(210, 250)
        );
    }
}
