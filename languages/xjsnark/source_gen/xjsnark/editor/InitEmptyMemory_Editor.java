package xjsnark.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class InitEmptyMemory_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_rz55fr_a(editorContext, node);
  }
  private EditorCell createCollection_rz55fr_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_rz55fr_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_rz55fr_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_rz55fr_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_rz55fr_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_rz55fr_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_rz55fr_e0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_rz55fr_f0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_rz55fr_g0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_rz55fr_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "INIT_EMPTY_RAM");
    editorCell.setCellId("Constant_rz55fr_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_rz55fr_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "<");
    editorCell.setCellId("Constant_rz55fr_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_RIGHT, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_rz55fr_c0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new InitEmptyMemory_Editor.typeSingleRoleHandler_rz55fr_c0(node, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x6804d86d4aa4dbc1L, 0x6804d86d4aa4dbc2L, "type"), editorContext);
    return provider.createCell();
  }
  private class typeSingleRoleHandler_rz55fr_c0 extends SingleRoleCellProvider {
    public typeSingleRoleHandler_rz55fr_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("type");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_type");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no type>";
    }
  }
  private EditorCell createConstant_rz55fr_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ">");
    editorCell.setCellId("Constant_rz55fr_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, 0, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_rz55fr_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_rz55fr_e0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_RIGHT, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_rz55fr_f0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new InitEmptyMemory_Editor.argLengthSingleRoleHandler_rz55fr_f0(node, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x6804d86d4aa4dbc1L, 0x6804d86d4aa4e484L, "argLength"), editorContext);
    return provider.createCell();
  }
  private class argLengthSingleRoleHandler_rz55fr_f0 extends SingleRoleCellProvider {
    public argLengthSingleRoleHandler_rz55fr_f0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("argLength");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_argLength");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no argLength>";
    }
  }
  private EditorCell createConstant_rz55fr_g0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_rz55fr_g0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
