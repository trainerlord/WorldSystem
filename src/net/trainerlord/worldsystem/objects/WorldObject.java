package net.trainerlord.worldsystem.objects;

public class WorldObject {



	private String worldName;
	private boolean useTemplate;
	private String templateName;
	private long seed;
	private String environment;
	private String worldType;
	private String generator;
	private boolean generateNaturalStructures;
	private boolean generateNether;
	private boolean generateEnd;
	private WorldGameRulesObject gameRules;
	
	
	public WorldObject(String worldName, boolean useTemplate, String templateName, long seed, String environment,
			String worldType, String generator, boolean generateNaturalStructures, boolean generateNether,
			 boolean generateEnd, WorldGameRulesObject gameRules) {
		super();
		this.worldName = worldName;
		this.useTemplate = useTemplate;
		this.templateName = templateName;
		this.seed = seed;
		this.environment = environment;
		this.worldType = worldType;
		this.generator = generator;
		this.generateNaturalStructures = generateNaturalStructures;
		this.generateNether = generateNether;
		this.generateEnd = generateEnd;
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


	public long getSeed() {
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
	
	public boolean isGenerateNether() {
		return generateNether;
	}


	public boolean isGenerateEnd() {
		return generateEnd;
	}


	public WorldGameRulesObject getGameRules() {
		return gameRules;
	}
	
	
	
}
