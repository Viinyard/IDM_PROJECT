import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import fr.istic.videoGen.VideoGeneratorModel;

@RunWith(value = Parameterized.class)
public class VideoGenTest1 {
	
	@Parameters(name = "videogens")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"example1.videogen"},
                {"example2.videogen"},
                {"example3.videogen"},
                {"example4.videogen"},
                {"example5.videogen"},
                {"example6.videogen"},
                {"example7.videogen"},
                {"example8.videogen"},
                {"example9.videogen"},
                {"example10.videogen"}
        });
    }
    
    private String videoGenFile;
    
    public VideoGenTest1(String videoGenFile) {
    	this.videoGenFile = videoGenFile;
    }

	
	@Test
	public void testInJava1() {
		
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(videoGenFile));
		assertNotNull(videoGen);
		//System.out.println(videoGen.getInformation().getAuthorName());		
		// and then visit the model
		// eg access video sequences: 
		// videoGen.getVideoseqs()
	}
	
	@Test
	public void testNbVariantes() {
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(videoGenFile));
		assertNotNull(videoGen);
		
		assertEquals("Nombre de variantes", new CalculateNombreVariantes().generate(videoGen), new GenerateAllVariantes().generate(videoGen).size());
	}
	
	@Test
	public void testNombreLigneCSV() {
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(videoGenFile));
		assertNotNull(videoGen);

		try {
			assertEquals("Nombre ligne CSV", new CalculateNombreVariantes().generate(videoGen) + 1, Files.lines(new GenerateCSVData().generate(videoGen, new File("stats.csv")).toPath()).count());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testNombreVignette() {
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(videoGenFile));
		assertNotNull(videoGen);
		
		assertEquals("Nombre de vignettes", new GenerateVignette().generate(new CalculateDuration().generate(videoGen)).size(), new CalculateNombreMedia().generate(videoGen));
	}
	
	@Test
	public void testNombreImagePageWeb() {
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(videoGenFile));
		assertNotNull(videoGen);
		
		//assertEquals("Nombre image page web", new CalculateNombreMedia().generate(videoGen), StringUtils.countOccurrencesOf(new GenerateWebPage().generate(videoGen), "<img"));
	}


}



