package com.hhh.pksmart.Components;

import android.graphics.Canvas;
import android.graphics.PixelFormat;
import android.support.v7.appcompat.R;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;

import com.hhh.pksmart.Interfaces.Element;
import com.hhh.pksmart.Interfaces.Material;
import com.hhh.pksmart.Interfaces.Node;
import com.hhh.pksmart.Interfaces.Section;
import com.hhh.pksmart.Interfaces.Shape;

/**
 * Created by kurt on 2/19/14.
 */
public class LineElement implements Element {
    Node nodeStart, nodeEnd;
    Shape line;
    //Load load;
    double angle;
    Material material;
    Section section;
    float realLength;
    float displayLength;
    MotionEvent motionEvent1, motionEvent2;
    float motion1X, motion1Y, motion2X, motion2Y;

    public void setMotionXY(float m1x, float m1y, float m2x, float m2y){
        motion1X = m1x;
        motion1Y = m1y;
        motion2X = m2x;
        motion2Y = m2y;

    }
    public Node getNodeStart() {
        return nodeStart;
    }

    public void setNodeStart(Node nodeStart) {
        this.nodeStart = nodeStart;
    }

    public Node getNodeEnd() {
        return nodeEnd;
    }

    public void setNodeEnd(Node nodeEnd) {
        this.nodeEnd = nodeEnd;
    }

    public Shape getLine() {
        return line;
    }

    public void setLine(Shape line) {
        this.line = line;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public void drawElement(MotionEvent e1, MotionEvent e2,SurfaceView surfaceView, int styleType) {
        //surfaceView.setZOrderOnTop(true);
        surfaceView.setZOrderOnTop(true);

        initComponets(e1, e2);
        nodeStart.draw();
        line.draw(surfaceView,styleType);
        nodeEnd.draw();
        Log.d("draw","draw a lineelement");
    }

    @Override
    public void autodrawElement(SurfaceView surfaceView, int styleType) {
        //surfaceView.setZOrderOnTop(true);

        //nodeStart.draw();
        line.draw(surfaceView,styleType);
        //nodeEnd.draw();
    }

    @Override
    public void drawElementOnView(Canvas canvas, int styleType) {
       // nodeStart = new LineElementNode(motionEvent1.getX(),motionEvent1.getY());
       // nodeEnd = new LineElementNode(motionEvent2.getX(), motionEvent2.getY());
        line = new Line(motion1X,motion1Y,motion2X,motion2Y);
        line.drawOnView(canvas, styleType);
    }

    @Override
    public void setMotionEvent1(MotionEvent motionEvent1) {
        this.motionEvent1 = motionEvent1;
    }

    @Override
    public void setMotionEvent2(MotionEvent motionEvent2) {
        this.motionEvent2 = motionEvent2;
    }

    private void initComponets(MotionEvent e1, MotionEvent e2) {
        nodeStart = new LineElementNode(e1.getX(),e1.getY());
        nodeEnd = new LineElementNode(e2.getX(),e2.getY());
        line = new Line(e1.getX(),e1.getY(),e2.getX(),e2.getY());
    }
}
