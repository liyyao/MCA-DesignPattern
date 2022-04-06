package builder.v1;

public interface TerrainBuilder {
    TerrainBuilder buildWall();
    TerrainBuilder buildFort();
    TerrainBuilder buildMine();

    Terrain build();
}
