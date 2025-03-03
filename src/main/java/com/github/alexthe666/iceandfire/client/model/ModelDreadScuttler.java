package com.github.alexthe666.iceandfire.client.model;

import com.github.alexthe666.iceandfire.entity.EntityDreadScuttler;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

public class ModelDreadScuttler extends ModelDragonBase {
    public AdvancedModelRenderer Body2;
    public AdvancedModelRenderer Body3;
    public AdvancedModelRenderer Body1;
    public AdvancedModelRenderer legTopR2;
    public AdvancedModelRenderer legTopR2_1;
    public AdvancedModelRenderer Body4;
    public AdvancedModelRenderer legTopR3;
    public AdvancedModelRenderer legTopR3_1;
    public AdvancedModelRenderer Body5;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer legMidR3;
    public AdvancedModelRenderer legBottomR3;
    public AdvancedModelRenderer legMidR3_1;
    public AdvancedModelRenderer legBottomR3_1;
    public AdvancedModelRenderer Neck1;
    public AdvancedModelRenderer legTopR1;
    public AdvancedModelRenderer legTopR1_1;
    public AdvancedModelRenderer HeadBase;
    public AdvancedModelRenderer palpTopL1;
    public AdvancedModelRenderer palpTopR1;
    public AdvancedModelRenderer palpMidL1;
    public AdvancedModelRenderer palpBottomR1;
    public AdvancedModelRenderer palpMidR1;
    public AdvancedModelRenderer palpBottomR1_1;
    public AdvancedModelRenderer legMidR1_1;
    public AdvancedModelRenderer legBottomR1;
    public AdvancedModelRenderer legMidR1_2;
    public AdvancedModelRenderer legBottomR1_1;
    public AdvancedModelRenderer legMidR2;
    public AdvancedModelRenderer legBottomR2;
    public AdvancedModelRenderer legMidR2_1;
    public AdvancedModelRenderer legBottomR2_1;
    private final ModelAnimator animator;

    public ModelDreadScuttler() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.legTopR1 = new AdvancedModelRenderer(this, 0, 54);
        this.legTopR1.mirror = true;
        this.legTopR1.setRotationPoint(-3.3F, 1.0F, 1.6F);
        this.legTopR1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(legTopR1, -0.45378560551852565F, -0.6981317007977318F, 0.9948376736367678F);
        this.legMidR2_1 = new AdvancedModelRenderer(this, 11, 50);
        this.legMidR2_1.setRotationPoint(0.0F, 6.4F, 0.1F);
        this.legMidR2_1.addBox(-1.5F, 0.0F, -1.0F, 3, 12, 2, 0.0F);
        this.setRotateAngle(legMidR2_1, 0.0F, 0.0F, 1.1383037381507017F);
        this.palpTopL1 = new AdvancedModelRenderer(this, 0, 73);
        this.palpTopL1.mirror = true;
        this.palpTopL1.setRotationPoint(2.4F, -2.1F, -9.4F);
        this.palpTopL1.addBox(-1.5F, 0.0F, -0.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(palpTopL1, -0.5918411493512771F, 0.0F, 0.0F);
        this.palpMidL1 = new AdvancedModelRenderer(this, 12, 74);
        this.palpMidL1.mirror = true;
        this.palpMidL1.setRotationPoint(0.0F, 6.4F, 0.1F);
        this.palpMidL1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(palpMidL1, 1.2292353921796064F, 0.0F, 0.0F);
        this.Neck1 = new AdvancedModelRenderer(this, 33, 22);
        this.Neck1.setRotationPoint(0.0F, 3.0F, -6.0F);
        this.Neck1.addBox(-2.5F, -4.7F, -2.5F, 5, 6, 3, 0.0F);
        this.setRotateAngle(Neck1, -0.27314402793711257F, 0.0F, 0.0F);
        this.legBottomR2 = new AdvancedModelRenderer(this, 22, 51);
        this.legBottomR2.mirror = true;
        this.legBottomR2.setRotationPoint(0.0F, 10.4F, 0.0F);
        this.legBottomR2.addBox(-1.01F, 0.0F, -0.9F, 2, 18, 2, 0.0F);
        this.setRotateAngle(legBottomR2, 0.0F, 0.0F, 1.3203415791337103F);
        this.palpBottomR1_1 = new AdvancedModelRenderer(this, 22, 72);
        this.palpBottomR1_1.mirror = true;
        this.palpBottomR1_1.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.palpBottomR1_1.addBox(-1.01F, 0.0F, -0.9F, 2, 5, 2, 0.0F);
        this.setRotateAngle(palpBottomR1_1, 0.7285004297824331F, 0.0F, 0.0F);
        this.HeadBase = new AdvancedModelRenderer(this, 0, 0);
        this.HeadBase.setRotationPoint(0.0F, -4.1F, 0.6F);
        this.HeadBase.addBox(-4.5F, -2.51F, -10.1F, 9, 8, 10, 0.0F);
        this.setRotateAngle(HeadBase, 1.1383037381507017F, 0.0F, 0.0F);
        this.legMidR3_1 = new AdvancedModelRenderer(this, 11, 50);
        this.legMidR3_1.mirror = true;
        this.legMidR3_1.setRotationPoint(0.0F, 6.4F, 0.1F);
        this.legMidR3_1.addBox(-1.5F, 0.0F, -1.0F, 3, 12, 2, 0.0F);
        this.setRotateAngle(legMidR3_1, 0.0F, 0.0F, -1.1383037381507017F);
        this.legMidR1_1 = new AdvancedModelRenderer(this, 11, 50);
        this.legMidR1_1.setRotationPoint(0.0F, 6.4F, 0.1F);
        this.legMidR1_1.addBox(-1.5F, 0.0F, -1.0F, 3, 12, 2, 0.0F);
        this.setRotateAngle(legMidR1_1, 0.0F, 0.0F, 1.1383037381507017F);
        this.legBottomR1_1 = new AdvancedModelRenderer(this, 22, 51);
        this.legBottomR1_1.mirror = true;
        this.legBottomR1_1.setRotationPoint(0.0F, 10.4F, 0.0F);
        this.legBottomR1_1.addBox(-1.01F, 0.0F, -0.9F, 2, 18, 2, 0.0F);
        this.setRotateAngle(legBottomR1_1, 0.0F, 0.0F, 1.3203415791337103F);
        this.palpTopR1 = new AdvancedModelRenderer(this, 0, 73);
        this.palpTopR1.setRotationPoint(-2.4F, -2.0F, -9.4F);
        this.palpTopR1.addBox(-1.5F, 0.0F, -0.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(palpTopR1, -0.5918411493512771F, 0.0F, 0.0F);
        this.legBottomR3 = new AdvancedModelRenderer(this, 22, 51);
        this.legBottomR3.setRotationPoint(0.0F, 10.4F, 0.0F);
        this.legBottomR3.addBox(-1.01F, 0.0F, -0.9F, 2, 18, 2, 0.0F);
        this.setRotateAngle(legBottomR3, 0.0F, 0.0F, -1.3203415791337103F);
        this.Body4 = new AdvancedModelRenderer(this, 58, 35);
        this.Body4.setRotationPoint(0.0F, -0.4F, 7.3F);
        this.Body4.addBox(-3.0F, -2.7F, -1.5F, 6, 7, 4, 0.0F);
        this.setRotateAngle(Body4, 0.40980330836826856F, 0.0F, 0.0F);
        this.palpMidR1 = new AdvancedModelRenderer(this, 12, 74);
        this.palpMidR1.mirror = true;
        this.palpMidR1.setRotationPoint(0.0F, 6.4F, 0.1F);
        this.palpMidR1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(palpMidR1, 1.2292353921796064F, 0.0F, 0.0F);
        this.legMidR1_2 = new AdvancedModelRenderer(this, 11, 50);
        this.legMidR1_2.mirror = true;
        this.legMidR1_2.setRotationPoint(0.0F, 6.4F, 0.1F);
        this.legMidR1_2.addBox(-1.5F, 0.0F, -1.0F, 3, 12, 2, 0.0F);
        this.setRotateAngle(legMidR1_2, 0.0F, 0.0F, -1.1383037381507017F);
        this.Body5 = new AdvancedModelRenderer(this, 82, 35);
        this.Body5.setRotationPoint(0.0F, -0.4F, 4.2F);
        this.Body5.addBox(-3.5F, -3.7F, -4.0F, 7, 8, 9, 0.0F);
        this.setRotateAngle(Body5, 0.5009094953223726F, 0.0F, 0.0F);
        this.Body1 = new AdvancedModelRenderer(this, 34, 47);
        this.Body1.setRotationPoint(0.0F, -1.2F, 2.0F);
        this.Body1.addBox(-3.5F, -2.1F, -6.3F, 7, 8, 9, 0.0F);
        this.setRotateAngle(Body1, 0.045553093477052F, 0.0F, 0.0F);
        this.legTopR3_1 = new AdvancedModelRenderer(this, 0, 54);
        this.legTopR3_1.setRotationPoint(3.3F, -1.0F, 6.6F);
        this.legTopR3_1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(legTopR3_1, 0.5009094953223726F, -0.22759093446006054F, -0.7740535232594852F);
        this.Tail1 = new AdvancedModelRenderer(this, 64, 80);
        this.Tail1.setRotationPoint(0.0F, -2.4F, 2.2F);
        this.Tail1.addBox(-6.5F, -4.2F, -2.1F, 13, 13, 17, 0.0F);
        this.setRotateAngle(Tail1, 0.27314402793711257F, 0.0F, 0.0F);
        this.legTopR1_1 = new AdvancedModelRenderer(this, 0, 54);
        this.legTopR1_1.setRotationPoint(3.3F, 1.0F, 1.6F);
        this.legTopR1_1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(legTopR1_1, -0.45378560551852565F, 0.6981317007977318F, -0.9948376736367678F);
        this.legBottomR3_1 = new AdvancedModelRenderer(this, 22, 51);
        this.legBottomR3_1.mirror = true;
        this.legBottomR3_1.setRotationPoint(0.0F, 10.4F, 0.0F);
        this.legBottomR3_1.addBox(-1.01F, 0.0F, -0.9F, 2, 18, 2, 0.0F);
        this.setRotateAngle(legBottomR3_1, 0.0F, 0.0F, 1.3203415791337103F);
        this.legBottomR1 = new AdvancedModelRenderer(this, 22, 51);
        this.legBottomR1.setRotationPoint(0.0F, 10.4F, 0.0F);
        this.legBottomR1.addBox(-1.01F, 0.0F, -0.9F, 2, 18, 2, 0.0F);
        this.setRotateAngle(legBottomR1, 0.0F, 0.0F, -1.3203415791337103F);
        this.legMidR2 = new AdvancedModelRenderer(this, 11, 50);
        this.legMidR2.mirror = true;
        this.legMidR2.setRotationPoint(0.0F, 6.4F, 0.1F);
        this.legMidR2.addBox(-1.5F, 0.0F, -1.0F, 3, 12, 2, 0.0F);
        this.setRotateAngle(legMidR2, 0.0F, 0.0F, -1.1383037381507017F);
        this.Tail2 = new AdvancedModelRenderer(this, 60, 17);
        this.Tail2.setRotationPoint(0.0F, 0.6F, 12.0F);
        this.Tail2.addBox(-4.0F, -2.7F, -0.1F, 8, 8, 8, 0.0F);
        this.setRotateAngle(Tail2, 0.136659280431156F, 0.0F, 0.0F);
        this.legTopR2 = new AdvancedModelRenderer(this, 0, 54);
        this.legTopR2.setRotationPoint(3.3F, -1.0F, 7.6F);
        this.legTopR2.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(legTopR2, 0.0F, 0.0F, -0.6981317007977318F);
        this.legMidR3 = new AdvancedModelRenderer(this, 11, 50);
        this.legMidR3.setRotationPoint(0.0F, 6.4F, 0.1F);
        this.legMidR3.addBox(-1.5F, 0.0F, -1.0F, 3, 12, 2, 0.0F);
        this.setRotateAngle(legMidR3, 0.0F, 0.0F, 1.1383037381507017F);
        this.Body2 = new AdvancedModelRenderer(this, 70, 53);
        this.Body2.setRotationPoint(0.0F, 8.6F, -6.0F);
        this.Body2.addBox(-3.0F, -2.7F, -0.1F, 6, 7, 4, 0.0F);
        this.setRotateAngle(Body2, -0.045553093477052F, 0.0F, 0.0F);
        this.Body3 = new AdvancedModelRenderer(this, 36, 73);
        this.Body3.setRotationPoint(0.0F, 0.2F, 4.1F);
        this.Body3.addBox(-4.5F, -3.4F, -1.4F, 9, 8, 10, 0.0F);
        this.legBottomR2_1 = new AdvancedModelRenderer(this, 22, 51);
        this.legBottomR2_1.setRotationPoint(0.0F, 10.4F, 0.0F);
        this.legBottomR2_1.addBox(-1.01F, 0.0F, -0.9F, 2, 18, 2, 0.0F);
        this.setRotateAngle(legBottomR2_1, 0.0F, 0.0F, -1.3203415791337103F);
        this.legTopR2_1 = new AdvancedModelRenderer(this, 0, 54);
        this.legTopR2_1.mirror = true;
        this.legTopR2_1.setRotationPoint(-3.3F, -1.0F, 7.6F);
        this.legTopR2_1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(legTopR2_1, 0.0F, 0.0F, 0.6981317007977318F);
        this.palpBottomR1 = new AdvancedModelRenderer(this, 22, 72);
        this.palpBottomR1.mirror = true;
        this.palpBottomR1.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.palpBottomR1.addBox(-1.01F, 0.0F, -0.9F, 2, 5, 2, 0.0F);
        this.setRotateAngle(palpBottomR1, 0.7285004297824331F, 0.0F, 0.0F);
        this.legTopR3 = new AdvancedModelRenderer(this, 0, 54);
        this.legTopR3.mirror = true;
        this.legTopR3.setRotationPoint(-3.3F, -1.0F, 6.6F);
        this.legTopR3.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(legTopR3, 0.5009094953223726F, 0.22759093446006054F, 0.7740535232594852F);
        this.Body1.addChild(this.legTopR1);
        this.legTopR2_1.addChild(this.legMidR2_1);
        this.HeadBase.addChild(this.palpTopL1);
        this.palpTopL1.addChild(this.palpMidL1);
        this.Body1.addChild(this.Neck1);
        this.legMidR2.addChild(this.legBottomR2);
        this.palpMidR1.addChild(this.palpBottomR1_1);
        this.Neck1.addChild(this.HeadBase);
        this.legTopR3_1.addChild(this.legMidR3_1);
        this.legTopR1.addChild(this.legMidR1_1);
        this.legMidR1_2.addChild(this.legBottomR1_1);
        this.HeadBase.addChild(this.palpTopR1);
        this.legMidR3.addChild(this.legBottomR3);
        this.Body3.addChild(this.Body4);
        this.palpTopR1.addChild(this.palpMidR1);
        this.legTopR1_1.addChild(this.legMidR1_2);
        this.Body4.addChild(this.Body5);
        this.Body2.addChild(this.Body1);
        this.Body3.addChild(this.legTopR3_1);
        this.Body5.addChild(this.Tail1);
        this.Body1.addChild(this.legTopR1_1);
        this.legMidR3_1.addChild(this.legBottomR3_1);
        this.legMidR1_1.addChild(this.legBottomR1);
        this.legTopR2.addChild(this.legMidR2);
        this.Tail1.addChild(this.Tail2);
        this.Body2.addChild(this.legTopR2);
        this.legTopR3.addChild(this.legMidR3);
        this.Body2.addChild(this.Body3);
        this.legMidR2_1.addChild(this.legBottomR2_1);
        this.Body2.addChild(this.legTopR2_1);
        this.palpMidL1.addChild(this.palpBottomR1);
        this.Body3.addChild(this.legTopR3);
        animator = ModelAnimator.create();
        this.updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body2.render(f5);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (EntityDreadScuttler) entity);
        animator.update(entity);
        animator.setAnimation(EntityDreadScuttler.ANIMATION_BITE);
        animator.startKeyframe(5);
        this.rotate(animator, Neck1, -30, 0, 0);
        this.rotate(animator, palpTopR1, -50, 0, 0);
        this.rotate(animator, palpTopL1, -50, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        this.rotate(animator, Neck1, -70, 0, 0);
        this.rotate(animator, HeadBase, 20, 0, 10);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityDreadScuttler.ANIMATION_SPAWN);
        animator.startKeyframe(0);
        animator.move(this.Body2, 0, 35, 0);
        animator.endKeyframe();
        animator.startKeyframe(30);
        animator.move(this.Body2, 0, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityDreadScuttler beast) {
        float speed_idle = 0.05F;
        float degree_idle = 0.5F;
        float speed_walk = 0.9F;
        float degree_walk = 0.3F;
        AdvancedModelRenderer[] GASTER = new AdvancedModelRenderer[]{Body4, Body5, Tail1, Tail2};
        AdvancedModelRenderer[] NECK = new AdvancedModelRenderer[]{Neck1, HeadBase};
        AdvancedModelRenderer[] LEGR1 = new AdvancedModelRenderer[]{legTopR1, legMidR1_2, legBottomR1};
        AdvancedModelRenderer[] LEGR2 = new AdvancedModelRenderer[]{legTopR2, legMidR2, legBottomR2};
        AdvancedModelRenderer[] LEGR3 = new AdvancedModelRenderer[]{legTopR3, legMidR3, legBottomR3};
        AdvancedModelRenderer[] LEGL1 = new AdvancedModelRenderer[]{legTopR1_1, legMidR1_1, legBottomR1_1};
        AdvancedModelRenderer[] LEGL2 = new AdvancedModelRenderer[]{legTopR2_1, legMidR2_1, legBottomR2_1};
        AdvancedModelRenderer[] LEGL3 = new AdvancedModelRenderer[]{legTopR3_1, legMidR3_1, legBottomR3_1};
        this.chainWave(GASTER, speed_idle, degree_idle * 0.25F, 0, f2, 1);
        this.chainWave(NECK, speed_idle, degree_idle * -0.15F, 2, f2, 1);
        this.swing(palpTopR1, speed_idle * 2F, degree_idle * -0.5F, false, 1, 0.2F, f2, 1);
        this.swing(palpTopL1, speed_idle * 2F, degree_idle * -0.5F, true, 1, 0.2F, f2, 1);

        this.walk(palpTopR1, speed_idle * 2F, degree_idle * -0.5F, true, 1, 0.2F, f2, 1);
        this.walk(palpTopL1, speed_idle * 2F, degree_idle * -0.5F, true, 1, 0.2F, f2, 1);

        this.walk(palpMidR1, speed_idle * 2F, degree_idle * -0.5F, true, 1, 0.2F, f2, 1);
        this.walk(palpMidL1, speed_idle * 2F, degree_idle * -0.5F, true, 1, 0.2F, f2, 1);

        if (beast.getAnimation() == EntityDreadScuttler.ANIMATION_SPAWN) {
            if (beast.getAnimationTick() < 39) {
                f = f2;
                f1 = 1;
            }
        }

        this.animateLeg(LEGR1, speed_walk, degree_walk, false, 0, 1, f, f1);
        this.animateLeg(LEGR3, speed_walk, degree_walk, false, 0, 1, f, f1);
        this.animateLeg(LEGR2, speed_walk, degree_walk, true, 0, 1, f, f1);

        this.animateLeg(LEGL1, speed_walk, degree_walk, false, 1, -1, f, f1);
        this.animateLeg(LEGL3, speed_walk, degree_walk, false, 1, -1, f, f1);
        this.animateLeg(LEGL2, speed_walk, degree_walk, true, 1, -1, f, f1);
    }

    private void animateLeg(AdvancedModelRenderer[] models, float speed, float degree, boolean reverse, float offset, float weight, float f, float f1) {
        this.flap(models[0], speed, degree * 0.4F, reverse, offset, weight * 0.2F, f, f1);
        this.flap(models[1], speed, degree * 2, reverse, offset, weight * -0.4F, f, f1);
        this.flap(models[1], speed, -degree * 1.2F, reverse, offset, weight * 0.5F, f, f1);
        this.walk(models[0], speed, degree, reverse, offset, 0F, f, f1);

    }
    
    @Override
    public void renderStatue() {
        this.resetToDefaultPose();
        this.Body2.render(0.0625F);
    }
}
