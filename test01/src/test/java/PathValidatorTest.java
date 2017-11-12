import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PathValidatorTest {
  PathValidator pathValidator = new PathValidator();

  @Test
  public void testPathConteinsInvalidSymbols() {
    assertFalse(pathValidator.isPathValid("C:jdkzfhj\\zjhdf\\*jkdsf\\skjdfh.txt"));
  }
  @Test
  public void testPathContainsInvalidWords() {
    assertFalse(pathValidator.isPathValid("C:hdj\\com9\\shjdg\\jkldfh.txt"));
  }
  @Test
  public void testPathContainsInvalidSymbolsAndWords() {
    assertFalse(pathValidator.isPathValid("C:dkjhf\\dhfbjs\\:xdhf\\COM9\\sdjbf.txt"));
  }
  @Test
  public void testPathContainsInvalidStartedSymbols() {
    assertTrue(pathValidator.isPathValid("c"));
    assertTrue(pathValidator.isPathValid("вра\\hsjdf\\kdzfb\\sdfj.txt"));
  }
  @Test
  public void testPathValid() {
    assertTrue(pathValidator.isPathValid("Z:\\hdf\\jhdfg\\skdfh.txt"));
  }
  @Test
  public void testPathServerValid() {
    assertTrue(pathValidator.isPathValid("\\\\sjf\\skjdf\\skjdfh.txt"));
  }
  @Test
  public void testPathStatrtsDoublePointValid() {
    assertTrue(pathValidator.isPathValid("..jASHKgf\\skjhfd\\asjh.txt"));
    assertTrue(pathValidator.isPathValid("..\\..\\..\\.."));
  }
  @Test
  public void testPathInDirectoryValid() {
    assertTrue(pathValidator.isPathValid("\\skdjf.txt"));
  }
  @Test
  public void testPathInDirectoryInvalid() {
    assertFalse(pathValidator.isPathValid("COM9.txt"));
  }

  @Test
  public void testStartedPointAndSlash() {
    assertTrue(pathValidator.isPathValid(".\\sfj"));
  }
}