package main.java.net.trainerlord.worldsystem.objects;

public class WorldObject {

	private String worldName;
	private boolean useTemplate;
	private String templateName;
	private int seed;
	private String environment;
	private String worldType;
	private String generator;
	private boolean generateNaturalStructures;
	private WorldGameRulesObject gameRules;
	
	
	public WorldObject(String worldName, boolean useTemplate, String templateName, int seed, String environment,
			String worldType, String generator, boolean generateNaturalStructures, WorldGameRulesObject gameRules) {
		super();
		this.worldName = worldName;
		this.useTemplate = useTemplate;
		this.templateName = templateName;
		this.seed = seed;
		this.environment = environment;
		this.worldType = worldType;
		this.generator = generator;
		this.generateNaturalStructures = generateNaturalStructures;
		this.gameRules = gameRules;
	}


	public String getWorldName() {
		return worldName;
	}


	public boolean isUseTemplate() {
		return useTemplate;
	}


	public String getTemplateName() {
		return templateName;
	}


	public int getSeed() {
		return seed;
	}


	public String getEnvironment() {
		return environment;
	}


	public String getWorldType() {
		return worldType;
	}


	public String getGenerator() {
		return generator;
	}


	public boolean isGenerateNaturalStructures() {
		return generateNaturalStructures;
	}


	public WorldGameRulesObject getGameRules() {
		return gameRules;
	}
	
	
	
}
