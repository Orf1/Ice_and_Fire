package com.github.alexthe666.iceandfire.client.model;

import com.github.alexthe666.iceandfire.entity.EntityDreadGhoul;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

public class ModelDreadGhoul extends ModelDragonBase {

    public AdvancedModelRenderer body;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer armRight;
    public AdvancedModelRenderer legRight;
    public AdvancedModelRenderer armLeft;
    public AdvancedModelRenderer legLeft;
    public AdvancedModelRenderer head2;
    public AdvancedModelRenderer clawsRight;
    public AdvancedModelRenderer clawsLeft;
    private final ModelAnimator animator;

    public ModelDreadGhoul() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.head = new AdvancedModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -7.4F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(head, 0.045553093477052F, 0.0F, 0.0F);
        this.legLeft = new AdvancedModelRenderer(this, 0, 16);
        this.legLeft.mirror = true;
        this.legLeft.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.legLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(legLeft, -0.045553093477052F, 0.0F, 0.0F);
        this.armRight = new AdvancedModelRenderer(this, 40, 16);
        this.armRight.setRotationPoint(-4.0F, 2.0F, 0.0F);
        this.armRight.addBox(-3.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(armRight, -0.136659280431156F, 0.091106186954104F, 0.22759093446006054F);
        this.armLeft = new AdvancedModelRenderer(this, 40, 16);
        this.armLeft.mirror = true;
        this.armLeft.setRotationPoint(4.0F, 2.0F, -0.0F);
        this.armLeft.addBox(0.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(armLeft, -0.136659280431156F, 0.091106186954104F, -0.22759093446006054F);
        this.head2 = new AdvancedModelRenderer(this, 32, 0);
        this.head2.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.head2.addBox(-4.5F, -6.4F, -4.1F, 9, 8, 8, 0.0F);
        this.clawsLeft = new AdvancedModelRenderer(this, 56, 25);
        this.clawsLeft.mirror = true;
        this.clawsLeft.setRotationPoint(-0.5F, 11.0F, 0.0F);
        this.clawsLeft.addBox(-1.0F, -2.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(clawsLeft, -0.0F, 0.0F, 0.2897246558310587F);
        this.body = new AdvancedModelRenderer(this, 16, 16);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.setRotateAngle(body, 0.045553093477052F, 0.0F, 0.0F);
        this.legRight = new AdvancedModelRenderer(this, 0, 16);
        this.legRight.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.legRight.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(legRight, -0.045553093477052F, 0.0F, 0.0F);
        this.clawsRight = new AdvancedModelRenderer(this, 56, 25);
        this.clawsRight.setRotationPoint(0.5F, 11.0F, 0.0F);
        this.clawsRight.addBox(-3.0F, -2.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(clawsRight, 0.0F, 0.0F, -0.2897246558310587F);
        this.body.addChild(this.head);
        this.body.addChild(this.legLeft);
        this.body.addChild(this.armRight);
        this.body.addChild(this.armLeft);
        this.head.addChild(this.head2);
        this.armLeft.addChild(this.clawsLeft);
        this.body.addChild(this.legRight);
        this.armRight.addChild(this.clawsRight);
        animator = ModelAnimator.create();
        this.updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (EntityDreadGhoul) entity);
        animator.update(entity);
        animator.setAnimation(EntityDreadGhoul.ANIMATION_SLASH);
        animator.startKeyframe(5);
        rotate(animator, this.armRight, 20, 45, 80);
        rotate(animator, this.body, 0, 30, 0);
        rotate(animator, this.head, 0, -20, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        rotate(animator, this.armRight, -80, -15, 10);
        rotate(animator, this.body, 0, -70, 0);
        rotate(animator, this.head, 0, 60, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        rotate(animator, this.armLeft, 20, -45, -80);
        rotate(animator, this.body, 0, -30, 0);
        rotate(animator, this.head, 0, 20, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        rotate(animator, this.armLeft, -80, 15, -10);
        rotate(animator, this.body, 0, 70, 0);
        rotate(animator, this.head, 0, -60, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityDreadGhoul.ANIMATION_SPAWN);
        animator.startKeyframe(0);
        animator.move(this.body, 0, 35, 0);
        rotateMinus(animator, this.armLeft, -180, -90, 50);
        rotateMinus(animator, this.head, -60, 0, 0);
        rotateMinus(animator, this.armRight, -180, 90, -50);
        animator.endKeyframe();
        animator.startKeyframe(30);
        animator.move(this.body, 0, 0, 0);
        rotate(animator, this.armLeft, -30, -90, 0);
        rotate(animator, this.armRight, -30, 90, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityDreadGhoul thrall) {
        float speed_walk = 0.6F;
        float speed_idle = 0.05F;
        float degree_walk = 1F;
        float degree_idle = 0.5F;
        if (thrall.getAnimation() == EntityDreadGhoul.ANIMATION_SPAWN) {
            if (thrall.getAnimationTick() < 30) {
                this.swing(armRight, 0.5F, degree_idle, false, 2, -0.7F, thrall.ticksExisted, 1);
                this.swing(armLeft, 0.5F, degree_idle, true, 2, -0.7F, thrall.ticksExisted, 1);
                this.flap(armRight, 0.5F, degree_idle, true, 1, 0, thrall.ticksExisted, 1);
                this.flap(armLeft, 0.5F, degree_idle, true, 1, 0, thrall.ticksExisted, 1);
            }
        }
        this.flap(armLeft, speed_idle, 0.15F, false, 2, -0.1F, thrall.ticksExisted, 1);
        this.flap(armRight, speed_idle, 0.15F, true, 2, -0.1F, thrall.ticksExisted, 1);
        this.flap(clawsLeft, speed_idle, 0.05F, false, 3, -0.05F, thrall.ticksExisted, 1);
        this.flap(clawsRight, speed_idle, 0.05F, true, 3, -0.05F, thrall.ticksExisted, 1);
        this.walk(head, speed_idle, 0.1F, true, 1, -0.05F, thrall.ticksExisted, 1);

        this.walk(legRight, speed_walk, degree_walk, false, 0, 0, f, f1);
        this.walk(legLeft, speed_walk, degree_walk, true, 0, 0, f, f1);
        this.flap(legRight, speed_walk, degree_walk * 0.1F, true, 3, -0.05F, f, f1);
        this.flap(legLeft, speed_walk, degree_walk * 0.1F, true, 3, 0.05F, f, f1);
        this.flap(body, speed_walk, degree_walk * 0.1F, true, 1, 0, f, f1);

        this.walk(armRight, speed_walk, degree_walk, true, -2, 0, f, f1);
        this.walk(armLeft, speed_walk, degree_walk, false, -2, 0, f, f1);
        this.flap(armRight, speed_walk, degree_walk * 0.8F, true, -2, -0.1F, f, f1);
        this.flap(armLeft, speed_walk, degree_walk * 0.8F, true, -2, 0.1F, f, f1);
        this.flap(head, speed_walk, degree_walk * 0.2F, false, 0, 0, f, f1);

    }

    @Override
    public void renderStatue() {
        this.resetToDefaultPose();
        this.body.render(0.0625F);
    }
}
