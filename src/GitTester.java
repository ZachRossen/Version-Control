import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GitTester {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Path p = Paths.get("testText.txt");
        try {
            Files.writeString(p, "sample text", StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		File testText = new File("testText.txt");
		testText.delete();
	}
	
	static void testInit() throws IOException {
		Git gitty = new Git();
		gitty.initiate();
		
		File index = new File("index");
		assertTrue(index.exists());
		File objects = new File("objects");
		assertTrue(objects.exists());
	}
	
	static void testBlob() throws Exception {
		Blob b = new Blob("testText.txt");
		File sha1 = new File("86f441fa0e99f2a36784217a323cea1f5fc0b7f6");
		assertTrue(sha1.exists());
		
	}
	
	static void testAdd() {
		Git gitty = new Git();
		gitty.initiate();
		
		gitty.add(testText.txt);
		assertTrue()
	}

	@Test
	void test() throws IOException {
		testInit();
		testBlob();
	}

}
