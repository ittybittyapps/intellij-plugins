package org.angularjs.settings;

import com.intellij.openapi.options.BeanConfigurable;
import com.intellij.openapi.options.UnnamedConfigurable;
import com.intellij.ui.IdeBorderFactory;

import javax.swing.*;

/**
 * @author Dennis.Ushakov
 */
public class AngularJSConfigurationPage extends BeanConfigurable<AngularJSConfig> implements UnnamedConfigurable {
  protected AngularJSConfigurationPage() {
    super(AngularJSConfig.getInstance());

    checkBox("INSERT_WHITESPACE", "Auto-insert whitespace in the interpolations");
  }

  @Override
  public JComponent createComponent() {
    JComponent result = super.createComponent();
    assert result != null;
    result.setBorder(IdeBorderFactory.createTitledBorder("AngularJS"));
    return result;
  }
}
