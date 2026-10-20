package belajar.java.unit.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
//import org.junit.jupiter.api.condition.OS;

public class ConditionTest {
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyOnWindows(){

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnWindows(){

    }

    @Test
    @EnabledOnJre({JRE.JAVA_24})
    public void testEnabledOnJava24(){

    }

    @Test
    @DisabledOnJre({JRE.JAVA_24})
    public void testDisabledOnJava24(){

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_20, max = JRE.JAVA_24)
    public void testEnabledOnJava20To24(){

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_20, max = JRE.JAVA_24)
    public void testDisabledOnJava20To24(){

    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named="java.vendor", matches = "Oracle Corporation")
    })
    public void enabledOnOracle(){

    }
    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named="java.vendor", matches = "Oracle Corporation")
    })
    public void disabledOnOracle(){

    }

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    void enabledOnProfileDev(){

    }
    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    void disabledOnProfileDev(){

    }

}
