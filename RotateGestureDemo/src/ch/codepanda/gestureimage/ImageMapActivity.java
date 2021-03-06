package ch.codepanda.gestureimage;

import ch.codepanda.gestureimage.widget.ImageMapGestureView;
import ch.codepanda.gestureimage.widget.area.AreaManager;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class ImageMapActivity extends Activity {

	private ImageMapGestureView mImage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_map);
		
		mImage = (ImageMapGestureView)findViewById(R.id.iv_gesture);
		mImage.getAreaManager().setOnClickHandler(new AreaManager.OnClickedHandler() {
			public void onClick(int id) {
				String text = "You clicked: " + getResources().getResourceEntryName(id).replace("map_", "");
				Toast.makeText(ImageMapActivity.this, text, Toast.LENGTH_SHORT).show();
			}
		});
	}
}
