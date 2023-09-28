package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    //TODO: Test that each job has a unique ID

    @Test public void testSettingJobId() {
        String msg = "the empty constructor sets a unique ID";
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(msg, job1.getId(), job2.getId());
    }

    //TODO: Test that constructor sets all fields

    @Test public void testJobConstructorSetsAllFields() {

        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertTrue("Constructor sets the name to correct class", job1.getName() instanceof String);
        assertEquals("Constructor sets name field","Product Tester", job1.getName());
        assertTrue("Constructor sets the employer to correct class", job1.getEmployer() instanceof Employer);
        assertEquals("Constructor sets employer field","ACME", job1.getEmployer().getValue());
        assertTrue("Constructor sets the location to correct class", job1.getLocation() instanceof Location);
        assertEquals("Constructor sets location field","Desert", job1.getLocation().getValue());
        assertTrue("Constructor sets the positionType to correct class", job1.getPositionType() instanceof PositionType);
        assertEquals("Constructor sets position type field","Quality Control", job1.getPositionType().getValue());
        assertTrue("Constructor sets the core competency to correct class", job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Constructor sets core competency field","Persistence", job1.getCoreCompetency().getValue());
    }


    //TODO: Test the equals() method
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));

    }

    //TODO: Test the toString() method

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String startMsg = "Test if toString starts with a blank line.";
        String endMsg = "Test if toString ends with a blank line.";
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String result = job1.toString();
        String expect = System.lineSeparator();
        assertTrue(startMsg, result.startsWith(expect));
        assertTrue(endMsg, result.endsWith(expect));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String msg = "Test if toString contains the correct labels and data";
        String newline = System.lineSeparator();
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String result = job1.toString();
        String expect = newline + "ID: " + job1.getId() + newline +
                "Name: " + "Product Tester" + newline +
                "Employer: " + "ACME" + newline +
                "Location: " + "Desert" + newline +
                "Position Type: " + "Quality Control" + newline +
                "Core Competency: " + "Persistence" + newline;
        assertEquals(msg, result, expect);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        String msg = "Test that an empty field returns Data not available";
        String newline = System.lineSeparator();
        Job job1 = new Job("", new Employer(""), new Location(null),
                new PositionType(), new CoreCompetency());
        String result = job1.toString();
        String expect = newline + "ID: " + job1.getId() + newline +
                "Name: " + "Data not available" + newline +
                "Employer: " + "Data not available" + newline +
                "Location: " + "Data not available" + newline +
                "Position Type: " + "Data not available" + newline +
                "Core Competency: " + "Data not available" + newline;
        assertEquals(msg, result, expect);

    }
}
