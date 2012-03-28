package fml.stubs.mcpserver;

import java.util.Random;

import fml.Mod;


import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.World;

@Mod(name="blah",version="blah")
public interface BaseMod {
  int addFuel(int id, int metadata);

  // void addRenderer(Map<Class<? extends Entity>, Render> renderers);
  boolean dispenseEntity(World world, double x, double y, double z, int xVel, int zVel, ItemStack item);

  void generateNether(World world, Random random, int chunkX, int chunkZ);

  void generateSurface(World world, Random random, int chunkX, int chunkZ);

  String getName();

  String getPriorities();

  abstract String getVersion();

  // void keyboardEvent(KeyBinding event);
  @Mod.PreInit
  abstract void load();

  @Mod.Init
  void modsLoaded();

  void onItemPickup(EntityPlayer player, ItemStack item);

  // boolean onTickInGame(float tick, Minecraft game);
  // boolean onTickInGUI(float tick, Minecraft game, GuiScreen gui);
  void receiveChatPacket(String text);

  void receiveCustomPacket(Packet250CustomPayload packet);

  // void registerAnimation(Minecraft game);
  // void renderInvBlock(RenderBlocks renderer, Block block, int metadata, int
  // modelID);
  // boolean renderWorldBlock(RenderBlocks renderer, IBlockAccess world, int x,
  // int y, int z, Block block, int modelID);
  void takenFromCrafting(EntityPlayer player, ItemStack item, IInventory matrix);

  void takenFromFurnace(EntityPlayer player, ItemStack item);

  String toString();
}
