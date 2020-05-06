package com.osslot.checkdigit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CheckDigitTest {

    @Test
    public void test1() throws Exception {
        CheckDigit.checkDigit("1978152424");
        assertEquals(9, CheckDigit.checkDigit("3429"));
    }

    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    public void testCheckDigit(int number, int expectedCheckedDigit) {
        assertEquals(expectedCheckedDigit, CheckDigit.checkDigit(Integer.toString(number)));
    }

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                arguments(464493487, 4),
                arguments(326030188, 4),
                arguments(166021606, 1),
                arguments(1987098227, 8),
                arguments(1548688459, 4),
                arguments(71746627, 4),
                arguments(1447089734, 2),
                arguments(1680942134, 2),
                arguments(52347670, 7),
                arguments(1015921792, 1),
                arguments(1858072237, 7),
                arguments(979122762, 9),
                arguments(616080558, 3),
                arguments(170691131, 2),
                arguments(603726820, 7),
                arguments(2047900172, 5),
                arguments(948009117, 3),
                arguments(55640908, 1),
                arguments(1823960232, 9),
                arguments(237014530, 7),
                arguments(153536772, 3),
                arguments(1702864221, 6),
                arguments(114640630, 7),
                arguments(975813133, 4),
                arguments(2031745341, 3),
                arguments(12337304, 5),
                arguments(1581522528, 3),
                arguments(1395544843, 1),
                arguments(656156475, 9),
                arguments(2129608392, 6),
                arguments(2079144901, 1),
                arguments(62915563, 1),
                arguments(1020706045, 7),
                arguments(715074227, 8),
                arguments(986692322, 2),
                arguments(1605525404, 5),
                arguments(2093628645, 9),
                arguments(1997158202, 8),
                arguments(962984278, 1),
                arguments(913815106, 7),
                arguments(1191348023, 5),
                arguments(1203488653, 4),
                arguments(1239091683, 6),
                arguments(717515517, 3),
                arguments(1743923145, 3),
                arguments(1077035023, 1),
                arguments(620487878, 5),
                arguments(2058549900, 6),
                arguments(608707703, 2),
                arguments(454957857, 9),
                arguments(673933417, 7),
                arguments(2070854443, 1),
                arguments(402315199, 7),
                arguments(1785604648, 4),
                arguments(156420372, 3),
                arguments(1136411642, 2),
                arguments(1836051751, 1),
                arguments(1250233038, 9),
                arguments(235589191, 7),
                arguments(60949487, 2),
                arguments(1944073135, 1),
                arguments(733604854, 4),
                arguments(1139770303, 7),
                arguments(1410094172, 2),
                arguments(1766123797, 4),
                arguments(1535105836, 1),
                arguments(1409668177, 4),
                arguments(1871097809, 5),
                arguments(632071670, 5),
                arguments(2090548416, 3),
                arguments(1709745590, 2),
                arguments(26329551, 6),
                arguments(493559093, 2),
                arguments(1855237835, 2),
                arguments(438475330, 1),
                arguments(854766224, 8),
                arguments(2109423064, 4),
                arguments(978270762, 3),
                arguments(1584455192, 8),
                arguments(954628238, 2),
                arguments(763555306, 4),
                arguments(803237768, 8),
                arguments(1228376414, 2),
                arguments(713632483, 1),
                arguments(255299419, 1),
                arguments(1111310929, 1),
                arguments(1358336135, 2),
                arguments(244043513, 8),
                arguments(1875587006, 2),
                arguments(1402606572, 6),
                arguments(1038515614, 7),
                arguments(210668786, 8),
                arguments(1149715463, 5),
                arguments(1303022890, 1),
                arguments(754134130, 1),
                arguments(1163544024, 3),
                arguments(890336658, 3),
                arguments(1993438807, 7),
                arguments(710404817, 5),
                arguments(2080865423, 2),
                arguments(192220158, 3),
                arguments(1988228621, 2),
                arguments(788033141, 8),
                arguments(1310396042, 2),
                arguments(529620742, 1),
                arguments(2106703113, 6),
                arguments(1625956464, 3),
                arguments(430954803, 9),
                arguments(778284797, 5),
                arguments(555721149, 3),
                arguments(692169187, 4),
                arguments(1390056062, 5),
                arguments(1075282098, 6),
                arguments(317624907, 3)
                );
    }

}