/**
 * generated by Xtext 2.15.0
 */
package fr.istic.generator;

import com.google.common.base.Objects;
import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.ImageDescription;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoDescription;
import fr.istic.videoGen.VideoGenInformation;
import fr.istic.videoGen.VideoGeneratorModel;
import java.util.Random;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class VideoGenGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject e : _contents) {
      if ((e instanceof VideoGeneratorModel)) {
        URI _uRI = resource.getURI();
        String _plus = (_uRI + ".ffmpeg");
        fsa.generateFile(_plus, this.compile(((VideoGeneratorModel)e)));
      }
    }
  }
  
  public CharSequence compile(final VideoGeneratorModel vgm) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = this.compile(vgm.getInformation());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    {
      EList<Media> _medias = vgm.getMedias();
      for(final Media m : _medias) {
        CharSequence _compile_1 = this.compile(m);
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final VideoGenInformation vgi) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _authorName = vgi.getAuthorName();
      boolean _notEquals = (!Objects.equal(_authorName, null));
      if (_notEquals) {
        _builder.append("# author : ");
        String _authorName_1 = vgi.getAuthorName();
        _builder.append(_authorName_1);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _version = vgi.getVersion();
      boolean _notEquals_1 = (!Objects.equal(_version, null));
      if (_notEquals_1) {
        _builder.append("# version : ");
        String _version_1 = vgi.getVersion();
        _builder.append(_version_1);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _creationDate = vgi.getCreationDate();
      boolean _notEquals_2 = (!Objects.equal(_creationDate, null));
      if (_notEquals_2) {
        _builder.append("# creation date : ");
        String _creationDate_1 = vgi.getCreationDate();
        _builder.append(_creationDate_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Media m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((m instanceof MandatoryMedia)) {
        CharSequence _compile = this.compile(((MandatoryMedia)m));
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((m instanceof OptionalMedia)) {
        CharSequence _compile_1 = this.compile(((OptionalMedia)m));
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((m instanceof AlternativesMedia)) {
        CharSequence _compile_2 = this.compile(((AlternativesMedia)m));
        _builder.append(_compile_2);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final MandatoryMedia mm) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = this.compile(mm.getDescription());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final OptionalMedia om) {
    StringConcatenation _builder = new StringConcatenation();
    {
      double _random = Math.random();
      boolean _lessThan = (_random < 0.5);
      if (_lessThan) {
        CharSequence _compile = this.compile(om.getDescription());
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final AlternativesMedia am) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = this.compile(am.getMedias().get(new Random().nextInt(((Object[])Conversions.unwrapArray(am.getMedias(), Object.class)).length)));
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final MediaDescription md) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((md instanceof VideoDescription)) {
        _builder.append("file ");
        String _location = ((VideoDescription)md).getLocation();
        _builder.append(_location);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((md instanceof ImageDescription)) {
        _builder.append("# image ");
        String _location_1 = ((ImageDescription)md).getLocation();
        _builder.append(_location_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
