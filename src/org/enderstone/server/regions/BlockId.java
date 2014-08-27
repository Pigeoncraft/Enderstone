/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.enderstone.server.regions;

/**
 *
 * @author Fernando
 */
public enum BlockId {

	AIR(0, true),
	STONE(1, true),
	GRASS(2, true),
	DIRT(3, true),
	COBBLESTONE(4, true),
	WOOD(5, true),
	SAPLING(6, true),
	BEDROCK(7, true),
	WATER_FLOWING(8, true),
	WATER(9, true),
	LAVA_FLOWING(10, true),
	LAVA(11, true),
	SAND(12, true),
	GRAVEL(13, true),
	GOLD_ORE(14, true),
	IRON_ORE(15, true),
	COAL_ORE(16, true),
	LOG(17, true),
	LEAVES(18, true),
	SPONGE(19, true),
	GLASS(20, true),
	LAPIS_ORE(21, true),
	LAPIS_BLOCK(22, true),
	DISPENSER(23, true),
	SANDSTONE(24, true),
	NOTE_BLOCK(25, true),
	BED_BLOCK(26, true),
	POWERED_RAIL(27, true),
	DETECTOR_RAIL(28, true),
	PISTON_STICKY_BASE(29, true),
	WEB(30, true),
	LONG_GRASS(31, true),
	DEAD_BUSH(32, true),
	PISTON_BASE(33, true),
	PISTON_EXTENSION(34, true),
	WOOL(35, true),
	PISTON_MOVING_PIECE(36, true),
	YELLOW_FLOWER(37, true),
	RED_ROSE(38, true),
	BROWN_MUSHROOM(39, true),
	RED_MUSHROOM(40, true),
	GOLD_BLOCK(41, true),
	IRON_BLOCK(42, true),
	DOUBLE_STEP(43, true),
	STEP(44, true),
	BRICK(45, true),
	TNT(46, true),
	BOOKSHELF(47, true),
	MOSSY_COBBLESTONE(48, true),
	OBSIDIAN(49, true),
	TORCH(50, true),
	FIRE(51, true),
	MOB_SPAWNER(52, true),
	WOOD_STAIRS(53, true),
	CHEST(54, true),
	REDSTONE_WIRE(55, true),
	DIAMOND_ORE(56, true),
	DIAMOND_BLOCK(57, true),
	WORKBENCH(58, true),
	CROPS(59, true),
	SOIL(60, true),
	FURNACE(61, true),
	BURNING_FURNACE(62, true),
	SIGN_POST(63, true),
	WOODEN_DOOR(64, true),
	LADDER(65, true),
	RAILS(66, true),
	COBBLESTONE_STAIRS(67, true),
	WALL_SIGN(68, true),
	LEVER(69, true),
	STONE_PLATE(70, true),
	IRON_DOOR_BLOCK(71, true),
	WOOD_PLATE(72, true),
	REDSTONE_ORE(73, true),
	CACTUS(81, true),
	CLAY(82, true),
	SUGAR_CANE_BLOCK(83, true),
	JUKEBOX(84, true),
	FENCE(85, true),
	PUMPKIN(86, true),
	NETHERRACK(87, true),
	SOUL_SAND(88, true),
	GLOWSTONE(89, true),
	PORTAL(90, true),
	JACK_O_LANTERN(91, true),
	CAKE_BLOCK(92, true),
	DIODE_BLOCK_OFF(93, true),
	DIODE_BLOCK_ON(94, true),
	LOCKED_CHEST(95, true),
	TRAP_DOOR(96, true),
	MONSTER_EGGS(97, true),
	SMOOTH_BRICK(98, true),
	HUGE_MUSHROOM_1(99, true),
	HUGE_MUSHROOM_2(100, true),
	IRON_FENCE(101, true),
	THIN_GLASS(102, true),
	MELON_BLOCK(103, true),
	PUMPKIN_STEM(104, true),
	MELON_STEM(105, true),
	VINE(106, true),
	FENCE_GATE(107, true),
	BRICK_STAIRS(108, true),
	SMOOTH_STAIRS(109, true),
	MYCEL(110, true),
	WATER_LILY(111, true),
	NETHER_BRICK(112, true),
	NETHER_FENCE(113, true),
	NETHER_BRICK_STAIRS(114, true),
	NETHER_WARTS(115, true),
	ENCHANTMENT_TABLE(116, true),
	BREWING_STAND(117, true),
	CAULDRON(118, true),
	ENDER_PORTAL(119, true),
	ENDER_PORTAL_FRAME(120, true),
	ENDER_STONE(121, true),
	DRAGON_EGG(122, true),
	REDSTONE_LAMP_OFF(123, true),
	REDSTONE_LAMP_ON(124, true),
	WOOD_DOUBLE_STEP(125, true),
	WOOD_STEP(126, true),
	COCOA(127, true),
	SANDSTONE_STAIRS(128, true),
	EMERALD_ORE(129, true),
	ENDER_CHEST(130, true),
	TRIPWIRE_HOOK(131, true),
	TRIPWIRE(132, true),
	EMERALD_BLOCK(133, true),
	SPRUCE_WOOD_STAIRS(134, true),
	BIRCH_WOOD_STAIRS(135, true),
	JUNGLE_WOOD_STAIRS(136, true),
	COMMAND(137, true),
	BEACON(138, true),
	COBBLE_WALL(139, true),
	FLOWER_POT(140, true),
	CARROT(141, true),
	POTATO(142, true),
	WOOD_BUTTON(143, true),
	SKULL(144, true),
	ANVIL(145, true),
	TRAPPED_CHEST(146, true),
	GOLD_PLATE(147, true),
	IRON_PLATE(148, true),
	REDSTONE_COMPARATOR_OFF(149, true),
	REDSTONE_COMPARATOR_ON(150, true),
	DAYLIGHT_DETECTOR(151, true),
	REDSTONE_BLOCK(152, true),
	QUARTZ_ORE(153, true),
	HOPPER(154, true),
	QUARTZ_BLOCK(155, true),
	QUARTZ_STAIRS(156, true),
	ACTIVATOR_RAIL(157, true),
	DROPPER(158, true),
	STAINED_CLAY(159, true),
	HAY_BLOCK(170, true),
	CARPET(171, true),
	HARD_CLAY(172, true),
	COAL_BLOCK(173, true),
	// ----- Item Separator -----
	IRON_SPADE(256, false),
	IRON_PICKAXE(257, false),
	IRON_AXE(258, false),
	FLINT_AND_STEEL(259, false),
	APPLE(260, false),
	BOW(261, false),
	ARROW(262, false),
	COAL(263, false),
	DIAMOND(264, false),
	IRON_INGOT(265, false),
	GOLD_INGOT(266, false),
	IRON_SWORD(267, false),
	WOOD_SWORD(268, false),
	WOOD_SPADE(269, false),
	WOOD_PICKAXE(270, false),
	WOOD_AXE(271, false),
	STONE_SWORD(272, false),
	STONE_SPADE(273, false),
	STONE_PICKAXE(274, false),
	STONE_AXE(275, false),
	DIAMOND_SWORD(276, false),
	DIAMOND_SPADE(277, false),
	DIAMOND_PICKAXE(278, false),
	DIAMOND_AXE(279, false),
	STICK(280, false),
	BOWL(281, false),
	MUSHROOM_SOUP(282, false),
	GOLD_SWORD(283, false),
	GOLD_SPADE(284, false),
	GOLD_PICKAXE(285, false),
	GOLD_AXE(286, false),
	STRING(287, false),
	FEATHER(288, false),
	SULPHUR(289, false),
	WOOD_HOE(290, false),
	STONE_HOE(291, false),
	IRON_HOE(292, false),
	DIAMOND_HOE(293, false),
	GOLD_HOE(294, false),
	SEEDS(295, false),
	WHEAT(296, false),
	BREAD(297, false),
	LEATHER_HELMET(298, false),
	LEATHER_CHESTPLATE(299, false),
	LEATHER_LEGGINGS(300, false),
	LEATHER_BOOTS(301, false),
	CHAINMAIL_HELMET(302, false),
	CHAINMAIL_CHESTPLATE(303, false),
	CHAINMAIL_LEGGINGS(304, false),
	CHAINMAIL_BOOTS(305, false),
	IRON_HELMET(306, false),
	IRON_CHESTPLATE(307, false),
	IRON_LEGGINGS(308, false),
	IRON_BOOTS(309, false),
	DIAMOND_HELMET(310, false),
	DIAMOND_CHESTPLATE(311, false),
	DIAMOND_LEGGINGS(312, false),
	DIAMOND_BOOTS(313, false),
	GOLD_HELMET(314, false),
	GOLD_CHESTPLATE(315, false),
	GOLD_LEGGINGS(316, false),
	GOLD_BOOTS(317, false),
	FLINT(318, false),
	PORK(319, false),
	GRILLED_PORK(320, false),
	PAINTING(321, false),
	GOLDEN_APPLE(322, false),
	SIGN(323, false),
	WOOD_DOOR(324, false),
	BUCKET(325, false),
	WATER_BUCKET(326, false),
	LAVA_BUCKET(327, false),
	MINECART(328, false),
	SADDLE(329, false),
	IRON_DOOR(330, false),
	REDSTONE(331, false),
	SNOW_BALL(332, false),
	BOAT(333, false),
	LEATHER(334, false),
	MILK_BUCKET(335, false),
	CLAY_BRICK(336, false),
	CLAY_BALL(337, false),
	SUGAR_CANE(338, false),
	PAPER(339, false),
	BOOK(340, false),
	SLIME_BALL(341, false),
	STORAGE_MINECART(342, false),
	POWERED_MINECART(343, false),
	EGG(344, false),
	COMPASS(345, false),
	FISHING_ROD(346, false),
	WATCH(347, false),
	GLOWSTONE_DUST(348, false),
	RAW_FISH(349, false),
	COOKED_FISH(350, false),
	INK_SACK(351, false),
	BONE(352, false),
	SUGAR(353, false),
	CAKE(354, false),
	BED(355, false),
	DIODE(356, false),
	COOKIE(357, false),
	MAP(358, false),
	SHEARS(359, false),
	MELON(360, false),
	PUMPKIN_SEEDS(361, false),
	MELON_SEEDS(362, false),
	RAW_BEEF(363, false),
	COOKED_BEEF(364, false),
	RAW_CHICKEN(365, false),
	COOKED_CHICKEN(366, false),
	ROTTEN_FLESH(367, false),
	ENDER_PEARL(368, false),
	BLAZE_ROD(369, false),
	GHAST_TEAR(370, false),
	GOLD_NUGGET(371, false),
	NETHER_STALK(372, false),
	POTION(373, false),
	GLASS_BOTTLE(374, false),
	SPIDER_EYE(375, false),
	FERMENTED_SPIDER_EYE(376, false),
	BLAZE_POWDER(377, false),
	MAGMA_CREAM(378, false),
	BREWING_STAND_ITEM(379, false),
	CAULDRON_ITEM(380, false),
	EYE_OF_ENDER(381, false),
	SPECKLED_MELON(382, false),
	MONSTER_EGG(383, false),
	EXP_BOTTLE(384, false),
	FIREBALL(385, false),
	BOOK_AND_QUILL(386, false),
	WRITTEN_BOOK(387, false),
	EMERALD(388, false),
	ITEM_FRAME(389, false),
	FLOWER_POT_ITEM(390, false),
	CARROT_ITEM(391, false),
	POTATO_ITEM(392, false),
	BAKED_POTATO(393, false),
	POISONOUS_POTATO(394, false),
	EMPTY_MAP(395, false),
	GOLDEN_CARROT(396, false),
	SKULL_ITEM(397, false),
	CARROT_STICK(398, false),
	NETHER_STAR(399, false),
	PUMPKIN_PIE(400, false),
	FIREWORK(401, false),
	FIREWORK_CHARGE(402, false),
	ENCHANTED_BOOK(403, false),
	REDSTONE_COMPARATOR(404, false),
	NETHER_BRICK_ITEM(405, false),
	QUARTZ(406, false),
	EXPLOSIVE_MINECART(407, false),
	HOPPER_MINECART(408, false),
	IRON_BARDING(417, false),
	GOLD_BARDING(418, false),
	DIAMOND_BARDING(419, false),
	LEASH(420, false),
	NAME_TAG(421, false),
	GOLD_RECORD(2256, false),
	GREEN_RECORD(2257, false),
	RECORD_3(2258, false),
	RECORD_4(2259, false),
	RECORD_5(2260, false),
	RECORD_6(2261, false),
	RECORD_7(2262, false),
	RECORD_8(2263, false),
	RECORD_9(2264, false),
	RECORD_10(2265, false),
	RECORD_11(2266, false),
	RECORD_12(2267, false),;

	private final int id;
	private final boolean validBlock;
	private final Class<?> dataClass;

	private BlockId(int id, boolean validBlock) {
		this(id, validBlock, null);
	}

	private BlockId(int id, boolean validBlock, Class<?> clazz) {
		this.id = id;
		this.dataClass = clazz;
		this.validBlock = validBlock;
	}

	public String getName() {
		return name().toLowerCase();
	}

	public Class<?> getDataClass() {
		return dataClass;
	}

	public short getId() {
		return (short) id;
	}
	/**
	 * All Minecraft item and block id's stored inside a array for performance reasons
	 */
	private static final BlockId[] byid = new BlockId[4096];

	static {
		for (BlockId block : values()) {
			byid[block.id] = block;
		}
	}

	public static BlockId byId(short s) {
		BlockId block = byid[s];
		if (block == null) {
			throw new RuntimeException("Unsupported block id " + s);
		}
		return block;
	}

	@Override
	public String toString() {
		return "BlockId{" + "id=" + id + ", validBlock=" + validBlock + '}';
	}
}
