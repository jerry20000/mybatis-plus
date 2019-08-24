package cn.sisyphe.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        String test = " \"stations\":[\n" +
                "        {\n" +
                "            \"short_name\":\"长沙万汇\",\n" +
                "            \"station_id\":\"CS01\",\n" +
                "            \"station_name\":\"长沙万象汇店\",\n" +
                "            \"station_parent\":\"WH00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"short_name\":\"长沙金茂\",\n" +
                "            \"station_id\":\"CS02\",\n" +
                "            \"station_name\":\"长沙金茂汇店\",\n" +
                "            \"station_parent\":\"WH00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"short_name\":\"长沙IFS\",\n" +
                "            \"station_id\":\"CS03\",\n" +
                "            \"station_name\":\"长沙IFS店\",\n" +
                "            \"station_parent\":\"WH00\"\n" +
                "        }\n" +
                "    ]";
    }
}
